package J65;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		Magazyn m1 = new Magazyn();
		Scanner menu = new Scanner(System.in);
		
		while(true){
			System.out.println("Co chesz zrobiæ: D-dodaj, U-usuñ, L-lista, Q-wyjœcie");
			String m = menu.nextLine();
			if(m.equals("D")){
				m1.dodajProdukt(new Magazyn());
			} 
			if (m.equals("L")){
				m1.stanyProdukty();
			}
			if (m.equals("U")){
				m1.usunProdukt(new Magazyn());
			}
			if (m.equals("Q")){
				System.out.println("koniec!");
				break;
			}
		}
		menu.close();
	}

}
