package methodTest;

import java.util.Scanner;

public class MethodTask {
//		1~10까지 println()으로 출력하는 메서드
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//		"홍길동"을 n번 println()으로 출력하는 메서드
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}

//		이름을 n번 println()으로 출력하는 메서드
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//		세 정수를 뺼셈해주는 메서드
	int sub(int number1, int number2, int number3) {
		return number1 - number2 - number3;
	}

//		두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메서드
	int[] getResultByDivision(int number1, int number2) {
		return new int[] { number1 / number2, number1 % number2 };
	}

//		1~n까지의 합을 구해주는 메서드
	int getTotalFrom1(int end) {
		int result = 0;
		for (int i = 0; i < end; i++) {
			result += i + 1;
		}
		return result;
	}

//		홀수를 짝수로, 짝수를 홀수로 바꿔주는 메서드(2 -> 3, 5 -> 6)
	int change(int number) {
		return ++number;
	}

//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메서드
	String changeToUpperCaseOrLowerCase(String content) {
		String result = "";
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			if (c >= 65 && c <= 90) {
				result += (char) (c + 32);
			} else if (c >= 97 && c <= 122) {
				result += (char) (c - 32);
			} else {
				result += c;
			}
		}

		return result;
	}

//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
	int getCountOfCharacterInContent(String content, char character) {
		int count = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == character) {
				count++; // count+1
			}
		}

		return count;
	}

//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메서드
	int getValueInArray(int[] arData, int index) { // �迭�� �ε����� �Ű������� �Է¹޴´�.
		return arData[index];

//		한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
	int changeToInteger(String hangle) {
		String hangles = "공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
			result += hangles.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}

//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메서드
//	int[] getMaxAndMin(int[] arData) {
//		int[] arResult = {arData[0], arData[0]};
//		for (int i = 1; i < arData.length; i++) {
//			if (arResult[0] < arData[i]) {
//				arResult[0] = arData[i];
//			}
//			if (arResult[1] > arData[i]) {
//				arResult[1] = arData[i];
//			}
//		}
//		
//		return arResult;
//	}

//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메서드(void)
	void getMaxAndMin(int[] arData, int[] arResult) {
		for (int i = 1; i < arData.length; i++) {
			if (arResult[0] < arData[i]) {
				arResult[0] = arData[i];
			}
			if (arResult[1] > arData[i]) {
				arResult[1] = arData[i];
			}
		}
	}
	
	
//		String 클래스의 indexOf() 메서드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	int indexOf(String content, char charcter) {
		for (int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == charcter) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
//		methodTask.printFrom1To10();
		
//		methodTask.printHong(10);
		
//		methodTask.printName("백시현", 10);
		
//		int result = methodTask.sub(1, 2, 3);
//		System.out.println(result);
		
//		int[] arResult = methodTask.getResultByDivision(10, 3);
//		System.out.println("몫: " + arResult[0]);
//		System.out.println("나머지: " + arResult[1]);
		
//		int result = methodTask.getTotalFrom1(100);
//		System.out.println(result);
		
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
//		String resultMessage = null;
//		
//		System.out.print("0 또는 자연수: ");
//		result = methodTask.change(sc.nextInt());
//		
//		resultMessage = result % 2 == 0 ? "짝수로 변경되었습니다." : "홀수로 변경되었습니다.";
//		System.out.println(resultMessage);
//		String result = methodTask.changeToUpperCaseOrLowerCase("apple123!@#GOOd");
//		System.out.println(result);
		
//		int count = methodTask.getCountOfCharacterInContent("apple", 'p');
//		System.out.println(count + "개");
		
//		int value = methodTask.getValueInArray(new int[] {1, 3, 5, 7, 9}, 2);
//		System.out.println(value);
		
		int result = methodTask.changeToInteger("팔공공일이삼");
		System.out.println(result);
		
//		int[] arResult = methodTask.getMaxAndMin(new int[] {3, 6, 1, 8, 9});
//		System.out.println("최소값: " + arResult[0]);
//		System.out.println("최대값: " + arResult[1]);
		
//		int[] arData = {3, 6, 1, 8, 9};
//		int[] arResult = {arData[0], arData[0]};
//		methodTask.getMaxAndMin(arData, arResult);
//		System.out.println("최소값: " + arResult[0]);
//		System.out.println("최대값: " + arResult[1]);
		
//		int result = methodTask.indexOf("apple", 'e');
//		System.out.println(result);
	}
}
















