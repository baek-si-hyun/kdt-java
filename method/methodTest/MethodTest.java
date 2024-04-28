package methodTest;

public class MethodTest {

//	f(x) = 2x+1
//	단, x는 정수이다.
	int f(int x){
		return 2 * x + 1;
	}
	
//	�� ������ ���� �޼ҵ�
	int add(int number1, int number2){
		return number1 + number2;
	}

//	메서드 사용방법
//	1. 메서드 선언시 static을 붙여준다
//	2. 사용하고자하는 메서드의 소속을 알려준다.

//	static을 선언하는 순간 heap메모리만 확인한다.
	public static void main(String[] args) {
//		new를 사용하여 heap메모리에 할당하면 static을 선언해도 사용할 수 있다.
		MethodTest mt = new MethodTest();
//		f는 heap메모리에 없기 때문에 에러가 생긴다.
//		System.out.println(mt.f(10));
		int result = mt.add(10, 20);
		System.out.println("결과값: " + result);
	}
}
















