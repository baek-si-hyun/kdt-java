package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
   public static String userId;
   public ArrayList<User> users = DBConnecter.users;
   private final int KEY = 3;
   
//   아이디 중복 검사
   public User checkId(String id) {
//      빠른 for문, 향상된 for문, forEach
      for(User user : users) {
         if(user.getId().equals(id)) {
            return user;
         }
      }
      return null;
   }
   
   
//   회원가입
   public void join(User user) {
      user.setPassword(encrypt(user.getPassword()));
      users.add(user);
   }
   
//   로그인
   public boolean login(User user) {
      User userInDb = checkId(user.getId());
      if(userInDb != null) {
         if(userInDb.getPassword().equals(encrypt(user.getPassword()))) {
            userId = user.getId();
            return true;
         }
      }
      return false;
      
   }
   
//   로그아웃
   public void logout() {
      userId = null;
   }
   
//   비밀번호 변경(마이페이지)
   public void update(User user) {
      User userInDb = checkId(user.getId());
      userInDb.setPassword(encrypt(user.getPassword()));
   }
   
//   비밀번호 변경(비밀번호 변경 페이지)
   public boolean update(String password, String newPassword) {
      User foundUser = checkId(userId);
      if(foundUser.getPassword().equals(encrypt(password))) {
         foundUser.setPassword(encrypt(newPassword));
         return true;
      }
      return false;
   }
   
// 인증번호 생성
   public String makeNumber(int count) {
	   Random random = new Random();
	   String number = "";
	   for (int i = 0; i < count; i++) {
		number += random.nextInt(10);
	}
	   return number;
   }
   
//   인증번호 전송
   public String sendNumber(String phone) {
	   String api_key = "";
	    String api_secret = "";
	    Message coolsms = new Message(api_key, api_secret);
	    String number = makeNumber(6);
	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", phone);
	    params.put("from", "01012341234");
	    params.put("type", "SMS");
	    params.put("text", "[인증번호]" + number);
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	    return number;
   }

//   암호와
   public String encrypt(String password) {
      String encryptedPassword = "";
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      return encryptedPassword;
   }
}


