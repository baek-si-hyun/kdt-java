package abstractTest;

public abstract class Electroics {

    @Override
    public abstract void on()
    @Override
    public abstract void off()

    public final void safe() {
        System.out.println("안정 장치 작동");
    }
}