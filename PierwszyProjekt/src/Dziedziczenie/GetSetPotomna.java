package Dziedziczenie;

public class GetSetPotomna extends GetSetBazowa {

	int rok = 0;
	public GetSetPotomna(String imie, int pesel, int rok) {	
	super(imie, pesel);	
	this.rok = rok;
	}
	
	public static void main(String[] args) {
		GetSetPotomna gs1 = new GetSetPotomna("Kamil", 123456789, 2000);
		
		System.out.println(gs1.getImie()+" "+gs1.getPesel()+" "+gs1.rok);
		
		gs1.setImie("karol");
		gs1.setPesel(1);
		gs1.rok = 2001;
		System.out.println(gs1.getImie()+" "+gs1.getPesel()+" " + gs1.rok);
		
		
	
		
		
		
		
		
		
		
		
		
	}
}
