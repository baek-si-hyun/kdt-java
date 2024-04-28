package controllStatmentTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int number1 = 0, number2 = 0;
	      String result = null;
	      String message = "두 정수를 입력하세요.", exampleMessage = "예)3 6";
	      
	      System.out.println(message);
	      System.out.println(exampleMessage);
	      
	      number1 = sc.nextInt();
	      number2 = sc.nextInt();
	      
	      if(number1 > number2) {
	    	  System.out.println("더 큰값: "+number1);
//	      }else if(number1 != number2) {
	      }else if(number1 < number2) {
	    	  System.out.println("더 작은 값: "+number2);
	      }else {
	    	  System.out.println("두 수는 같습니다.");
	      }
	      
	      System.out.println(result);
	}

}
