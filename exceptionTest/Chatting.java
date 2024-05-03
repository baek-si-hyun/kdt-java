package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		System.out.println("상대방에세 보내는 메세지: ");
		message = sc.nextLine();
		
//	contains는 포함된 문자열이 있나 확인한다.
		if(message.contains("바보")) {
			try {
				throw new BadWordException("비속어 사용");
			} catch (BadWordException e) {
				System.out.println("비속어는 사용하지 말아주세요");
			}
		}else {
			System.out.println(message);
		}
	}

}
