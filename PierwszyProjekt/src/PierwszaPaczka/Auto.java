package PierwszaPaczka;

public class Auto {

	int iloscDrzwi;
	double cena;
	//double brutto;
	String kolorNadwozia, kolorFelg, kolorOpon, marka, model;
	
	public double rabat() {
		cena = cena*0.9;
		return cena;
	}
	
	public double brutto(double cena) {
		double brutto = cena*1.23;
		return brutto;
	}
	
	public void bruttoNetto(double cena) {
		System.out.println("Do zap³aty: ");
		System.out.println("Cena netto: " + cena);
		System.out.println("Cena brutto: " + cena*1.23);
	}
	
	Auto(int iloscDrzwi, 
			String kolorNadwozia, 
			String kolorFelg, 
			String kolorOpon, 
			String marka, 
			String model,
			double cena) {
		this.iloscDrzwi = iloscDrzwi;
		this.kolorNadwozia = kolorNadwozia;
		this.kolorFelg = kolorFelg;
		this.kolorOpon = kolorOpon;
		this.marka = marka;
		this.model = model;
		this.cena = cena;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto garbus = new Auto(4,"niebieski","czerwony","czarny","VW","Garbus", 10000);
		
		/*garbus.iloscDrzwi = 4;
		garbus.kolorNadwozia = "niebieski";
		garbus.kolorFelg = "czerwony";
		garbus.kolorOpon = "czarny";
		garbus.marka = "VW";
		garbus.model = "Garbus";*/
		
		System.out.println(">>>Volkswagen<<<");
		System.out.println("");
		
		System.out.println(garbus.iloscDrzwi);
		System.out.println(garbus.kolorFelg);
		System.out.println(garbus.kolorNadwozia);
		System.out.println(garbus.kolorOpon);
		System.out.println(garbus.marka);
		System.out.println(garbus.model);
		
		Auto audi = new Auto(5,"czarny","zielony","czarny","Audi","A5", 15000);
		
		System.out.println("");
		System.out.println(">>>Audi<<<");
		System.out.println("");
		
		System.out.println(audi.iloscDrzwi);
		System.out.println(audi.kolorFelg);
		System.out.println(audi.kolorNadwozia);
		System.out.println(audi.kolorOpon);
		System.out.println(audi.marka);
		System.out.println(audi.model);
		
		Auto ford = new Auto(3,"¿ó³ty","szary","czarny","Ford","Ka", 20000);
		
		System.out.println("");
		System.out.println(">>>Ford<<<");
		System.out.println("");
		
		System.out.println(ford.iloscDrzwi);
		System.out.println(ford.kolorFelg);
		System.out.println(ford.kolorNadwozia);
		System.out.println(ford.kolorOpon);
		System.out.println(ford.marka);
		System.out.println(ford.model);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
