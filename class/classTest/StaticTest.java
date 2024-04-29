package staticTest;

class Data {
    int data = 10;
    static int data_s = 10;

    void increase(){
        System.out.println(++data);
    }

    static void increase_s(){
        System.out.println(++data_s);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Data data1 = new Data();

//        data1.increase();
//        data1.increase();
//        data1.increase();
//        data1.increase();
//        data1.increase();
//        // 초기화 됨
//        data1 = new Data();
//        data1.increase();
//        data1.increase();
//        data1.increase();
//        data1.increase();

        data1.increase_s();
        data1.increase_s();
        data1.increase_s();
        data1.increase_s();
        data1.increase_s();
        data1.increase_s();
        // 초기화 안됨
        // 이유는 static은 new로 초기화 할수 없다.
        // static은 컴파일러가 최초에 한번 메모리에 할당하기 때문이다.
        data1 = new Data();
        data1.increase_s();
        data1.increase_s();
        data1.increase_s();
        data1.increase_s();
        data1.increase_s();



    }
}