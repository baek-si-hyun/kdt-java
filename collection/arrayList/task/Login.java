package collectionTest.arrayList.task;

import java.util.Scanner;

public class Login {
   public static void main(String[] args) {
      UserField userField = new UserField();
      User user = new User();
      
      user.setId("bsh5803");
      user.setName("백시현");
      user.setPassword("13241234");
      user.setPhone("01012341234");

      if(userField.checkId(user.getId()) == null) {
         
////         인증번호 발송
//    	  String number = userField.sendNumber(user.getPhone());
////         인증번호 검사
//    	  System.out.println("인증번호:");
//    	  if(number.equals(new Scanner(System.in).next())	){
            userField.join(user);
            System.out.println(DBConnecter.users);
//         }else{
//            System.out.println("인증번호를 확인해주세요");
//         }
//      }else {
//         System.out.println("중복된 아이디");
//      }
      
//      if(userField.checkId(user2.getId()) == null) {
//         userField.join(user2);
//         System.out.println(DBConnecter.users);
//      }else {
//         System.out.println("중복된 아이디");
      }

      
      User userForLogin = new User();
      userForLogin.setId("bsh5803");
      userForLogin.setPassword("13241234");
      
      if(userField.login(userForLogin)) {
         System.out.println("로그인 성공");
         
      }else {
         System.out.println("로그인 실패");
         
      }
      
////      마이페이지
//      User foundUser = userField.checkId(UserField.userId);
//      foundUser.setPassword("6666");
//      
////      비밀번호 변경
//      userField.update(foundUser);
//      
////      로그아웃
//      userField.logout();
////		로그인
//      userForLogin = new User();
//      userForLogin.setId("hds1234");
//      userForLogin.setPassword("8888");
//      
//      if(userField.login(userForLogin)) {
//         System.out.println("로그인 성공");
//         
//      }else {
//         System.out.println("로그인 실패");
//         
//      }
   }
}



