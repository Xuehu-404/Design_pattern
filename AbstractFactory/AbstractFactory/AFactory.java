package AbstractFactory;

public class AFactory implements IProductFactory{
    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Vegetable createVegetable() {
        return new Patato();
    }
}
