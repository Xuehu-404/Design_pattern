package SingletonPattern;

public class MyFruit implements Cloneable{
    protected String kind;
    public void Display(){
        System.out.println(kind);
    }

    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        obj = super.clone();
        return obj;
    }
}


