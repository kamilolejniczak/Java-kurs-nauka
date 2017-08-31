package Polimorfizm;

public class Zwierze extends Organizm {

	int liczbaNog = 4;
	
	public String przypiszDNA(String DNA) {
		super.przypiszDNA(DNA);
		return DNA;
	}
	
	public void zmienNogi(int liczbaNog){
		this.liczbaNog = liczbaNog;
	}
	public void info() {
		System.out.println(DNA+"liczba nog "+liczbaNog);
	}
}
