package PierwszaPaczka;						//J59

public class Przeciazanie2 {

	double pierwsze;
	char drugie;
	
	public void J59(double pierwsze) {
		
		this.pierwsze = pierwsze;
		System.out.println(pierwsze);
	}
	public void J59(char drugie) {
		
		this.drugie = drugie;
		System.out.println(drugie);
	}	
	public void J59(double pierwsze, char drugie) {
		
		this.pierwsze = pierwsze;
		this.drugie = drugie;
		System.out.println(pierwsze +""+ drugie);
	}	
	public void J59(char drugie, double pierwsze) {
		
		this.drugie = drugie;
		this.pierwsze = pierwsze;
		System.out.println(drugie+""+pierwsze);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Przeciazanie2 test1 = new Przeciazanie2();
		Przeciazanie2 test2 = new Przeciazanie2();
		Przeciazanie2 test3 = new Przeciazanie2();
		Przeciazanie2 test4 = new Przeciazanie2();
		
		test1.J59('a');
		test2.J59(2.2);
		test3.J59('b', 2.2);
		test4.J59(2.2, '3');
		
	
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
