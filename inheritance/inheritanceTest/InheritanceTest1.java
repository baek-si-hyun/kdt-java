package inheritanceTest;

class A{
	String name;
	int data;
	
	public A() {
		System.out.println("부모 생성자 호출됨.");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	
	public B() {
	   super();
	   System.out.println("자식 생성자 호출됨.");
	   }
	   
	   void printData() {
	      System.out.println(data);
	   }

}
public class InheritanceTest1 {
	public static void main(String[] args) {
	B b = new B();
	b.printName();
}
}
