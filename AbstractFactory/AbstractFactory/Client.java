package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("============A工厂产品============");
        //创建A工厂
        IProductFactory aFactory = new AFactory();

        //生产A工厂水果
        Fruit aFruit = aFactory.createFruit();
        aFruit.eat();

        //生产A工厂蔬菜
        Vegetable aVegetable = aFactory.createVegetable();
        aVegetable.eat();

        System.out.println("============B工厂产品============");
        //创建B工厂
        IProductFactory bFactory = new BFactory();

        //生产B工厂水果
        Fruit bFruit = bFactory.createFruit();
        bFruit.eat();

        //生产B工厂蔬菜
        Vegetable bVegetable = bFactory.createVegetable();
        bVegetable.eat();
    }
}
