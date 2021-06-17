package 访问者模式;

public class Customer extends AVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客"+name+"选苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客"+name+"买书 ");
    }
}
