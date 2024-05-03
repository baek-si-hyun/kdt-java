package lambdaTask;

public class PrintNameTest {
		public static void main(String[] args) {
//			외부에서 전달받은 성 씨, 이름을 받아서 전체 이름을 제작한다.
			PrintName printName = (lastName, firstName) -> lastName + firstName;
//			PrintName printName = new PrintName() {
//				
//				@Override
//				public String getFullName(String lastName, String firstName) {
//					return firstName + lastName;
//				}
//			};
			
			System.out.println(printName.getFullName("��", "���"));
		}

}
