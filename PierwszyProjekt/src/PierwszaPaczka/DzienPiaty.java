package PierwszaPaczka;
												// Obiekty testowe
public class DzienPiaty {

	static String p = "zmienna globalna";			//zmienna  klasowa
												//metoda klasowa
	
	static void info() {
		int b = 2;
		if(true) {
			int c=3;
		}
		System.out.println("Jestem w metodzie info");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;										//zmienna main
		
		for(int i=0; i<9; i++) {
			//zakres lokalny p�tli for
			System.out.println("W p�tli " + i);
			a=a+1;
			System.out.println(a);
		}
		
		//zmienna i nie jest widoczna poza p�tl�
		//System.out.println(i);
		
		//zmienna klasowa
		System.out.println(p); //je�li dodam do "String" static to mo�na wy�wietli� p
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
