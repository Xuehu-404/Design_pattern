package factory.method;

public class MoBaiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
