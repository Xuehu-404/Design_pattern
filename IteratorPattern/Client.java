package 迭代器模式;

public class Client {
    public static void display(Television tv)
    {
        TVIterator i = tv.createIterator();
        System.out.println("电视机频道：");
        while (!i.isLast())
        {
            System.out.println(i.currentChannel());
            i.next();
        }
    }
    public static void main(String[] args) {
        Television television1,television2;
        television1 = new SkyworthTelevision();
        television2 = new TCLTelevision();
        display(television1);
        display(television2);
    }
}
