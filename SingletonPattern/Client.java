package SingletonPattern;


//浅拷贝
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = new Banana();

        MyFruitStore mfs = MyFruitStore.Getfruitstore();

        mfs.Add(1, fru1);
        mfs.Add(2, fru2);
        mfs.Add(3, new Apple());
        mfs.Add(4, new Banana());
        MyFruitStore mfs2 = MyFruitStore.Getfruitstore();

        MyFruit fru = (MyFruit) mfs2.Get(4);
        fru.Display();
        System.out.println("mfs1:" + mfs.toString());
        System.out.println("mfs2" + mfs2.toString());
    }
}


