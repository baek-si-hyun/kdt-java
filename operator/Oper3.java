package operatorTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//     심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 횐색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
      
//      사용자에게 키를 입력받고
//      정수라면 정수로 출력
//      실수라면 실수로 출력
//      예)   183 -> 183 출력
//         183.5 -> 183.5 출력
//      삼항 연산자를 사용

		사용자의 입력을 받기위해 Scanner를 사용한다.
		Scanner sc = new Scanner(System.in);
		String message1 = "Q. 당신이 좋아하는 색을 선택하세요",
				examplemessage = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색",
				errorMessage = "다시 입력해 주세요",
				result1 = "빨간색 : 불같고 열정적이고 적극적이다.",
				result2 = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.",
				result3 = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.",
				result4 = "횐색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.",
				result = null;

//		사용자의 입력값을 저장하기 위한 변수
		int sellect = 0;
		
		System.out.println(message1);
		System.out.println(examplemessage);
//		사용자가 입력한 값을 nextInt를 사용하여 정수로 받는다.
		sellect = sc.nextInt();
		
		result = sellect == 1 ? result1 
			: sellect == 2 ? result2
				: sellect == 3 ? result3
					: sellect == 4 ? result4
							: errorMessage;
	}
}
