package 访问者模式;

public class Saler extends AVisitor{
    @Override
    public void visit(Book book) {
        System.out.println("收银员"+name+"给苹果过秤。");
    }

    @Override
    public void visit(Apple apple) {
        System.out.println("收银员"+name+"直接计算书本价格。");
    }
}
