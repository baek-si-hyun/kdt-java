package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배여렝 담기
//		- if문은 딱 한번 사용하기
		
//		alt + shift + z : 영역 단축키 (영역을 잡고 사용해야 한다)
		
		Scanner sc = new Scanner(System.in);
		String message = "번쨰 정수: ", temp = null;
		int[] arData = new int[5];
		int count = 0;
		
		while(true) {
			count++;
			System.out.print(count+message);
			temp = sc.next();
			if(temp.equals("q")) {
				break;
			}
			try {
				arData[count - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요.");
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개의 정수까지만 입력할 수 있습니다.");
				for (int i = 0; i < arData.length; i++) {
					System.out.print(arData[i] + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("알수없는 오류");
				count--;
			}

		}
	}
}
