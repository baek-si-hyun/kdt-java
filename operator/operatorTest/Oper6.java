package operatorTest;

import java.util.Iterator;

public class Oper6 {
	public static void main(String[] args) {
//		1~10까지 중 3제외하고 출력
		for (int i = 0; i < 10; i++) {
			if(i == 2) {continue;}
			System.out.println(i+1);
		}
//		1~10까지 중 3까지만 출력
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1);
//			if(i == 2) {break;}
//		}
	}
}
