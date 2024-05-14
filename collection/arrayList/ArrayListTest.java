package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

   public static void main(String[] args) {
//      <?>: 제네릭(이름이 없는)
//      객체화 시 타입을 지정하는 기법
//      설게할 때에는 타입을 지정할 수 없기 떄문에 임시로 타입을 선언할 때 사용한다.
//      따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.

      
      ArrayList<Integer> datas = new ArrayList<Integer>();
      
      System.out.println(datas.size());
      datas.add(10);
      datas.add(30);
      datas.add(50);
      datas.add(60);
      datas.add(20);
      datas.add(70);
      datas.add(80);
      datas.add(90);
      System.out.println(datas.size());
      try {
         System.out.println(datas.get(10));
      } catch (Exception e) {
         System.out.println("인덱스 똑바로!");
      }
      Collections.shuffle(datas);
      Collections.sort(datas);
      System.out.println(datas);
      Collections.reverse(datas);
      System.out.println(datas);
//    추가(삽입)
//    50뒤에 500 삽입
      if(datas.contains(50)) {
    	  try {
			datas.add(datas.indexOf(50) + 1, 500);
		} catch (Exception e) {
			System.out.println("인덱스 똑바로!");
		}
      } else {
    	  System.out.println("찾으시는 값이 없습니다.");
      }
      System.out.println(datas);
      
//    수정
//    90을 9로 수정
      if(datas.contains(90)) {
    	  int prev = datas.set(datas.indexOf(90), 9);
    	  System.out.println(prev + " 수정 완료");
      }
      System.out.println(datas);
      
    
//    삭제
//      datas.clear();
//    80 삭제
//    1. 인덱스로 삭제
//      if(datas.contains(80)) {
//    	  int deletedData = datas.remove(datas.indexOf(80));
//    	  System.out.println(deletedData + " 삭제 완료");
//    	  System.out.println(datas);
//      }
      
//    2. 값으로 삭제
      if(datas.remove(Integer.valueOf(80))) {
    	  System.out.println("삭제 성공");
    	  System.out.println(datas);
      }

   }
}

