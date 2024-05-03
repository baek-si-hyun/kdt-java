package abstractTest;

public class WashingMachine extends Electronics{

    @Override
    public void on(){
        System.out.println("밀어서");
    }

    @Override
    public void off(){
        System.out.println("당겨서");
    }
}