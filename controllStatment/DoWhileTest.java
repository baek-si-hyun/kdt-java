package controllStatmentTest;

import java.util.Scanner;

public class DoWhileTest {
	   public static void main(String[] args) {
	      String message = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색";
	      Scanner sc = new Scanner(System.in);
	      int choice = 0;
	      
	      do {
	         System.out.println(message);
	         choice = sc.nextInt();
	      } while(choice != 0);
	      
	   }
}