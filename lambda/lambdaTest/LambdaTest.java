package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		함수형 인터페이스에서만 람다 가능
//		LambdaInter lambdaInter = number -> number % 10 == 0;
		LambdaInter lambdaInter = new LambdaInter() {
			
			@Override
			public boolean checkMultipleOf10(int number) {
				return number % 10 == 0;
			}
		};
		
		System.out.println(lambdaInter.checkMultipleOf10(20));
		
	}
}
