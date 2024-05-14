package collectionTest.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
//		데이터를 가져오고 싶을때 순서를 부여해야한다.
//		iterator가 정답이다.
		HashSet<String> bloodTypeSet = new HashSet<String>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {	
			System.out.println(iter.next());
		}

//		중복을 제거할 떄 써라
//		DMBS의 기본구조가 Set이다!
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 1, 2));
//		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
//		
//		System.out.println(datas);
//		
//		HashSet<String> bloodTypeSet = new HashSet<String>();
//		
//		bloodTypeSet.add("A");
//		bloodTypeSet.add("B");
//		bloodTypeSet.add("O");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("AB");
//		
//		System.out.println(bloodTypeSet.size());
//		System.out.println(bloodTypeSet);
	}

}
