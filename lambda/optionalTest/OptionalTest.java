package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("�ѵ���", "hds", "1234"),
			new User("�輼ȯ", "ksh", "2345"),
			new User("�ڼ���", "bsj", "3456"),
			new User("�����", "sgd", "4567")
			));
//	�����ϰ��� �ϴ� Ÿ���� ���ϸ��� �ְ� Optional�� ����
//	�Ʒ� �޼ҵ�� ���� ���ϴ� ���ϰ��� Optional ��ü�� �ٲٴ� ����̴�.
//	���� Optional ����ٰ� �� Optional�� ������ ����!
//	�ݵ�� ���� Ÿ�Կ����� Optional�� ����ϰ�, ���� ��ü�� �����ش�. ���� Ÿ���� ���� ��ü ��ȸ�� ��
//	��) Optional<List<User>> : ����.
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInBD : users) {
			if(userInBD.getId() == id) {
				user = userInBD;
			}
		}
//		���� ���� Optional�� �Ѵ�.
//		Optional�� .of()�� .ofNullable() 2������ �ִ�.
//		.of()�� �����ϴ� ��ü�� ���� null�� �� ���� �� ����Ѵ�.
//		.ofNullable()�� �����ϴ� ��ü�� null�� �� �� ���� �� ����Ѵ�.
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		Optional<User> foundUser = optionalTest.findById(30L);
//		�ִٸ� user��üȭ, ���ٸ� �߻� ��ų ���� ������
//		���߿� handler�� ����Ͽ� ���ϴ� �޼ҵ� ���� ����
		User user = foundUser.orElseThrow(() -> {throw new NoSuchUserException("�׷� ��� �����ϴ�.");});
		
//		���⼭ findById�� Optional ��ü�̸� Optional��ü�� stream���� �ٷ� ����� �� �ִ�.
//		�� �� .ifPresent()�� ��ü�� null�� �ƴҶ����� ������ �ȴ�. �� null���� ���ϵǸ� ������� �ʴ´�.
//		optionalTest.findById(30L).map(User::getUserId).ifPresent(System.out::println);
		
//		.ifPresentOrElse(()->{}, ()->{})�� �ĸ� ���� null���� �ƴҶ� ������ �����̰� �ڴ� null�� �϶� ������ ������ �ִ´�.
		optionalTest.findById(30L).map(User::getUserId)
		.ifPresentOrElse(userId -> {
			System.out.println(userId);
		}, () -> {
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		});
	}
}
