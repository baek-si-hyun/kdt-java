package controllStatmentTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message1 = "Q. 당신이 좋아하는 색을 선택하세요",
				examplemessage = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색",
				errorMessage = "다시 입력해 주세요",
				result1 = "빨간색 : 불같고 열정적이고 적극적이다.",
				result2 = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.",
				result3 = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.",
				result4 = "횐색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.",
				result = null;
		int choice = 0;

		System.out.println(message1);
		System.out.println(examplemessage);
		choice = sc.nextInt();

		switch(choice){
			case 1:
				result = result1;
				break;
			case 2:
				result = result2;
				break;
			case 3:
				result = result3;
				break;
			case 4:
				result = result4;
				break;
			default:
				result = errorMessage;
				break;
		}
		System.out.println(result);
	}
}
