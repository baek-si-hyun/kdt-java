package classTest;

class A {
	int data;
	// 오버로딩
	public A(int data) {
		this.data = data;
		
	}
	public A() {;}
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
//		객체화
		A a = new A(10);
		A b = new A();
		
		System.out.println(a);
		System.out.println(b);
		
		a.data = 10;
		
		a.printData();
		b.printData();
	}

}
