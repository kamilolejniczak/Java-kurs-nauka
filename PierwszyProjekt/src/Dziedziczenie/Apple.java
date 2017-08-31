package Dziedziczenie;			//J70

public class Apple extends Fruit{

	String odmiana;
public Apple(){}
	public Apple(String odmiana) {
		super();
		this.odmiana = odmiana;
	}
	
	public void printInfo(){
		System.out.println("Kategoria: " + kategoria+" odmiana " + odmiana);
	}
	
	
	
}
