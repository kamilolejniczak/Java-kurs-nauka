package Abstrakcyjna;

public abstract class Owoce {
//sta³a
	public static final String owoce = "owoc";
	//zmienna
	public boolean dojrzaly;
	//metoda abstrakcyjna
	public abstract void printInfo();
	//metoda
	public void dojrzewanie() {
		this.dojrzaly = true;
	}
	
}
