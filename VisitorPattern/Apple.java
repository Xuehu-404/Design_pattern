package 访问者模式;

public class Apple implements IProduct{
    @Override
    public void accept(AVisitor visitor) {
        visitor.visit(this);
    }
}
