package PierwszaPaczka;				//J53 rozkmini�!!!!!!

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Produkt {

	Scanner rl = new Scanner(System.in);
	HashMap<String, Double> mapa = new HashMap<String, Double>();
	ArrayList<String> lista = new ArrayList<String>();
	
	Produkt(){
		mapa.put("chleb", 1.23);
		mapa.put("mleko", 2.99);
		mapa.put("jaja", 3.99);
		mapa.put("m�ka", 3.99);
		mapa.put("cukier", 3.99);
		mapa.put("bu�ki", 3.99);
		mapa.put("pomidory", 3.99);
		mapa.put("woda", 3.99);
		mapa.put("pomara�cze", 3.99);
		mapa.put("ser", 3.90);
	}
	public double oblicz(){
		float sum = 0;
		System.out.println("Podaj nazw� produktu: ");
		String rr = rl.nextLine();		
		while( (!rr.equals("end")) && (!rr.equals("END")) ){
			if(mapa.containsKey(rr) && !lista.contains(rr)){
				sum += mapa.get(rr);
				lista.add(rr);
			} else if(mapa.containsKey(rr) && lista.contains(rr)){
				System.out.println("Czy na pewno chcesz doda� ten produkt(t/n)?: ");
				String xx = rl.nextLine();
				if (xx.equals("t")){
					sum += mapa.get(rr);
					lista.add(rr);	
				}
			} else {
				System.out.println("Z�a nazwa produktu: ");
			}
			rr = rl.nextLine();
		}
		System.out.println("Cena za twoje zakupy: " + sum + "z�");
		rl.close();
		return sum;
		}

	
	
	
}
