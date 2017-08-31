package PierwszaPaczka;

public class CarShop {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Kupujemy auto: ");
		Auto audi = new Auto(4,"bia³y","z³ote","chrome","Audi","A5",100000);
		System.out.println("Kupi³eœ: " + audi.marka + " " + audi.model);
		System.out.println("Do zap³aty: " + audi.cena);
		
		/*boolean res = audi instanceof Auto;
		System.out.println(res);
		
		double cena_brutto_rabat = audi.brutto(audi.cena);
		System.out.println(cena_brutto_rabat);
		
		audi.bruttoNetto(audi.cena);
		
		//System.out.println(audi.brutto);
*/		
		System.out.println("Po rabacie: " +audi.rabat());
		audi.bruttoNetto(audi.cena);
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
