package exceptionTest;

//RuntimeException: 컴파일러가 검사하지 않음(강제 종료 시키고 싶을 때 사용)
//Exception: 컴파일러가 검사함(강제 종료가 아닌 해당 상황 처리를 원할 때 사용)
public class BadWordException extends Exception{
	public BadWordException(String message) {
		super(message);
	}

}
