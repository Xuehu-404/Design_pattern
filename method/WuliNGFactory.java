package factory.method;

public class WuliNGFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
