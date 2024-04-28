package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//      사용자에게 입력받은 무낮열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      입력 예)안녕hi!!
//      출력 예)안녕Hi!!
      
//      힌트
//      각 문자를 반복문을 사용하여 charAt()으로 가져오기
//		각 문자가 소문자 아스키 코드 범위, 대문자 아스키 코드 범위 인지 if문으로 검사
//      if문에 들어왔다면 -32 또는 +32를 하여 소문자를 대문자로, 대문자를 소문자로 변경
//		만약 아스키 코드의 범위에 있는 문자가 아니라면, 그문자 그대로 사용

//      null과 ""
//      null : 아래에서 대입연산자를 사용할 때, 다른 값으로 대체할 때
//      "" : 아래에서 다른 문자열과 연결할 때, 다른 값이 누적 연결될 때
//      Scanner sc = new Scanner(System.in);
//      String message = "문자열 입력: ", input = null, result = "";
//      
//      System.out.print(message);
//      input = sc.nextLine();
//      
//      for (int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i);
//         if(c >= 65 && c <= 90) { //대문자
//            result += (char)(c + 32);
//         }else if(c >= 97 && c <= 122) { //소문자
//            result += (char)(c - 32);
//         }else {
//            result += c;
//         }
//      }
//      
//      System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		String message = "���� �Է� : ", input = null, result = "";
//      정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
      
//      힌트
//       입력받은 정수를 문자열로 변경
//       각 문자를 어떤 배열의 인덱스 번호로 활용
//       어떤 배열은 한글을 담고 있어야한다
//       해당 인덱스의 값을 연결하여 변경된 한글을 출력한다.

//		Scanner sc = new Scanner(System.in);
//		String hangle = "공일이삼사오육칠팔구", input = null,
//				message = "정수 : ", result = "";
//		
//		System.out.println(message);
//		input = sc.next();
//		
//		for (int i = 0; i < input.length(); i++) {
//			result += hangle.charAt(input.charAt(i)-48);
		String a = "apple pen";
		a = a.trim();
		a = a.replaceAll(" ", "");
		System.out.println(a);
		System.out.println(a.indexOf(0));
	}

}
