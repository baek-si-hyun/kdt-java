package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
		double num1 = 8.43, num2 = 2.59;
		int result = 0;
//		자동 형변환
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		
//		강제 형변환
		System.out.println(5 / (double)2);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		
//		8.43 + 2.59 = 10
		result = (int)num1+(int)num2;
		System.out.println((int)num1+(int)num2);
		System.out.println(result);
	}
}
