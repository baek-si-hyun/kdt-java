package inheritanceTest;

class Humen {
	String name;
	
	public Humen() {;}
	
	public Humen(String name) {
		this.name = name;
	}
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("잠자기");
	}
	void walk() {
		System.out.println("두 발로 걷기");
	}
	
}

class Monkey extends Humen{
	@Override
	void walk() {
		super.walk();
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		monkey.walk();
	}
}
