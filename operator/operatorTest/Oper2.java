package operatorTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		대소비교
//		두 정수 입력받기, nextInt()
		Scanner sc = new Scanner(System.in);
		String message = "두 정수를 입력하세요.", exampleMessage = "예) 1 3";
		int number1 = 0, number2 =0, result = 0;
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		result = number1 > number2 ? number1 : number2;
		
		System.out.println("더 큰값: "+result);
		
	}

}
