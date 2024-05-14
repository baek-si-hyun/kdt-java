package collectionTest.hashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		userMap.put("id", "bsh1234");
		userMap.put("password", "1234");
		userMap.put("name", "백시현");
		userMap.put("age", "20");
		
		System.out.println(userMap.size());
		
		System.out.println(userMap.get("id"));
//		순서가 없는 set구조에 iterator를 사용하여 순서를 만들어주는 과정
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			if(entry.getKey().equals("name")) {
				System.out.println(entry.getValue());
			}
		}
		
//		JSONObject json = new JSONObject();
		
		
		
		
	}
}
