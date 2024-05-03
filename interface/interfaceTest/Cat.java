package interfaceTest;

public class Cat implements Pet{
	@Override
	public void sitDown() {
		System.out.println("앉는다");
	}
	
	@Override
	public void waitNow() {
		System.out.println("기다린다");
	}
	
	@Override
	public void poop() {
		System.out.println("볼일을 본다");
	}
	
}
