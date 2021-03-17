public class MainClass {
    public static void main(String[] args) {
        AbstractSource source = new DatabaseSource();
        AbstractTransformer transformer=new XLSTransformer();
        source.Test();
        transformer.Test();
    }
}
