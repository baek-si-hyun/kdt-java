package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "백시현";
		int age = 20;
		double height = 123.7;
//		printf는 서식문자를 사용해야할 때 사용한다.
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d살\n", age);
		System.out.printf("키: %.1fcm", height);
	}

}
