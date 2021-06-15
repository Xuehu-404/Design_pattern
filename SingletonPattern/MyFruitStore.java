package SingletonPattern;

import java.util.Hashtable;

public class MyFruitStore {

    private  static Hashtable fruittable=null;
    private static MyFruitStore fruitStore = null;
    //private static Hashtable fruitstore = new Hashtable<Integer, MyFruit>();

    private MyFruitStore(){
        fruittable = new Hashtable<Integer,MyFruit>();
    }

    public static MyFruitStore Getfruitstore(){
        if(fruitStore==null)
        {
            fruitStore = new MyFruitStore();
        }
        return fruitStore;
    }

    public void Add(Integer key, MyFruit fruit){
        fruittable.put(key,fruit);
    }


    public  MyFruit Get(Integer key) throws CloneNotSupportedException {
        MyFruit fruit = (MyFruit)fruittable.get(key);
        return (MyFruit)fruit.clone();
    }

}
