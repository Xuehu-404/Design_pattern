package AbstractFactory;

public class BFactory implements IProductFactory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public Vegetable createVegetable() {
        return new Tomato();
    }
}
