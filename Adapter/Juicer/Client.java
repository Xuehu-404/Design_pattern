package Juicer;

public class Client {
	public static void main(String[] args) {
		InewJuicer newjuicer = new Adapter();
		Apple apple = new Apple();
		Banana banana = new Banana();
		String str = newjuicer.newPort(apple,banana);
		System.out.println(str);
		
		
	}
}
