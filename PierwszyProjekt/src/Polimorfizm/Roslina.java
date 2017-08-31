package Polimorfizm;

public class Roslina extends Organizm {

	int dLodygi;
	
	public void info(){
		System.out.println("DNA "+DNA+" dlugosc lodygi "+dLodygi);
	}
	public void zmienDlodygi(int dLodygi){
		this.dLodygi = dLodygi;
	}
	public String przypiszDNA(String DNA) {
		super.przypiszDNA(DNA);
		return DNA;
	}
}
