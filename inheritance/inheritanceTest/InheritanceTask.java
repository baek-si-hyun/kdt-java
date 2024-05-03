package inheritanceTest;

class Car {
   String brand;
   String color;
   int price;
   
   public Car() {;}//�⺻ ������

   public Car(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
   void engineStart() {
      System.out.println("열쇠 시동 켜짐");
   }
   
   void engineStop() {//���� ���� �޼ҵ����
      System.out.println("열쇠 시동 꺼짐");
   }
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {

		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("시동 켜짐");
	}
	
	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("시동 꺼짐");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar farrari = new SuperCar("Ferrari", "blue", 700_000_000, "sports");
		farrari.engineStart();
		farrari.engineStop();
	}
}