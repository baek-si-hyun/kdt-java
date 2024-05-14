package hashCodeTest;

import java.util.Random;
//HashCode는 jvm이 관리하는 중복없는 값, 메모리주소는 따로있다.
public class HashCodeTest {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.hashCode());
	}
}
