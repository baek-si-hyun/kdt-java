package anonymous;

public interface Test {
	public static void main(String[] args) {
		Study study = new Study() {
			
			@Override
			public void setTopic(String topic) {
				System.out.println("주제 : "+topic);
			}
		};
		
		System.out.println("화학");
	}
}
