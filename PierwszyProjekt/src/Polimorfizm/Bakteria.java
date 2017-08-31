package Polimorfizm;

public class Bakteria extends Organizm{

	String szkodliwosc;
	
	public void info(){
		System.out.println("DNA "+DNA+" szkodliwosc  "+szkodliwosc);
	}
	public void zmienSzkodliwosc(String szkodliwosc){
		this.szkodliwosc = szkodliwosc;
	}
	public String przypiszDNA(String DNA) {
		super.przypiszDNA(DNA);
		return DNA;
	}
}
