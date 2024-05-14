package collectionTest.hashSet;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		User user1 = new User(1, "김개똥", 20, "개발자");
		User user2 = new User(2, "아무개", 20, "소방관");
		User user3 = new User(3, "강해린", 20, "가수");
		User user4 = new User(4, "김민지", 20, "댄서");
		User user5 = new User(5, "하니", 20, "연예인");
		
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		users.stream().map(user -> new JSONObject(user)).forEach(usersJSON::put);
		
		System.out.println(usersJSON);
	}

}
