package Polimorfizm;

public abstract class Organizm {

	String DNA;
	
	public String przypiszDNA(String DNA){
		this.DNA = DNA;
		return DNA;
	}
	
	public abstract void info();
		
	
}
