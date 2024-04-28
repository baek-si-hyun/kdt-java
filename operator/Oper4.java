package operatorTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//      (마스터)
//      사용자에게 키를 입력받고
//      정수라면 정수로 출력
//      실수라면 실수로 출력
//      예) 183 -> 183 출력
//         183.5 -> 183.5 출력
//      삼항연산자를 사용

      double height = 0.0;
      Scanner sc = new Scanner(System.in);
      String message = "키 :", format = null;
      boolean isInteger = false;
      
      System.out.print(message);
      height = sc.nextDouble();
      
      isInteger = height - (int)height == 0;
      
      format = isInteger ? "%.0fcm" : "%.2fcm";
      format += "\n";
      
      System.out.printf(format, height);

		
		
	}
}
