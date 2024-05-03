package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("한동석", "hds", "1234"),
			new User("김세환", "ksh", "2345"),
			new User("박세준", "bsj", "3456"),
			new User("서경덕", "sgd", "4567")
			));
//	리턴하고자 하는 타입을 제니릭에 넣고 Optional로 랩핑
//	아래 메소드는 내가 원하는 리턴값을 Optional 객체로 바꾸는 방법이다.
//	제발 Optional 배웠다고 다 Optional로 감싸지 말자!
//	반드시 리턴 타입에서만 Optional을 사용하고, 단일 객체만 감싸준다. 리턴 타입의 단일 객체 조회할 때
//	예) Optional<List<User>> : 망함.
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInBD : users) {
			if(userInBD.getId() == id) {
				user = userInBD;
			}
		}
//		리턴 또한 Optional로 한다.
//		Optional은 .of()와 .ofNullable() 2가지가 있다.
//		.of()는 리턴하는 객체가 절대 null일 수 없을 때 사용한다.
//		.ofNullable()는 리턴하는 객체가 null일 수 도 있을 때 사용한다.
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		Optional<User> foundUser = optionalTest.findById(30L);
//		있다면 user객체화, 없다면 발생 시킬 에러 생성자
//		나중에 handler를 사용하여 원하는 메소드 실행 가능
		User user = foundUser.orElseThrow(() -> {throw new NoSuchUserException("그런 사람 없습니다.");});
		
//		여기서 findById는 Optional 객체이며 Optional객체는 stream으로 바로 사용할 수 있다.
//		이 때 .ifPresent()는 객체가 null이 아닐때에만 실행이 된다. 즉 null값이 리턴되면 실행되지 않는다.
//		optionalTest.findById(30L).map(User::getUserId).ifPresent(System.out::println);
		
//		.ifPresentOrElse(()->{}, ()->{})는 컴마 앞은 null값이 아닐때 실행할 문장이고 뒤는 null값 일때 실행할 문장을 넣는다.
		optionalTest.findById(30L).map(User::getUserId)
		.ifPresentOrElse(userId -> {
			System.out.println(userId);
		}, () -> {
			System.out.println("존재하지 않는 회원입니다.");
		});
	}
}
