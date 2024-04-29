package castingTest;

class Car {
   
   public Car() {;}
   
   void engineStart() {
      System.out.println("열쇠로 시동 킴");
   }
   
}

class SuperCar extends Car{
   @Override
   void engineStart() {
      System.out.println("음성으로 시동 킴");
   }
   
   void openRoof() {
      System.out.println("지붕 열기");
   }
}

public class CastingTest {
   public static void main(String[] args) {
      Car matiz = new Car();
      SuperCar ferrari = new SuperCar();
      
//      up casting
      Car noOptionFerrari = new SuperCar();
      noOptionFerrari.engineStart();
      
//      down casting
      SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
      fullOptionFerrari.openRoof();
      
//      오류
//      SuperCar brokenFerrari = (SuperCar) new Car();
      
//      instanceof : 조건식
//      객체 instanceof 타입 : 참 또는 거짓
      
      System.out.println(matiz instanceof Car);//true
      System.out.println(matiz instanceof SuperCar);//false
      System.out.println(ferrari instanceof Car);//true
      System.out.println(ferrari instanceof SuperCar);//ture
      System.out.println(noOptionFerrari instanceof Car);//true
      System.out.println(noOptionFerrari instanceof SuperCar);//true
      System.out.println(fullOptionFerrari instanceof Car);//true
      System.out.println(fullOptionFerrari instanceof SuperCar);//true
      
   }
}

