package PrototypePattern;


//浅拷贝
public class Client {

    public static void main(String[] args) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = fru1;
        fru1.Display();
        fru2.Display();

        System.out.println("fru1.hash"+fru1.hashCode());
        System.out.println("fru2.hash"+fru2.hashCode());

    }
    public String factory(String fruitname){
        if(fruitname.equals("Apple"))
            return "Apple";
        if(fruitname.equals("Banana"))
            return "Banana";
        return fruitname;
    }
}


