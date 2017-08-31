package Abstrakcyjna;

public class Jablka extends Owoce {
	
	String odmiana = "nieznana";
	
	public void printInfo() {
		System.out.println(owoce+" "+dojrzaly+" "+odmiana);
	}

	public void zmien(String odmiana) {
		this.odmiana = odmiana;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jablka j = new Jablka();
		j.zmien("Szampion");
		j.printInfo();
		j.dojrzewanie();
		j.printInfo();
		
	}

}
