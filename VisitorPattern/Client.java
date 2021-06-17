package 访问者模式;

public class Client {
    public static void main(String[] args) {
        IProduct b = new Book();
        IProduct a = new Apple();
        IProduct b2 = new Book();
        AVisitor visitor;

        BuyBasket basket = new BuyBasket();
        basket.addProduct(b,a,b2);

        visitor = new Customer();
        visitor.setName("肥仔昆昆");
        basket.accept(visitor);
    }
}
