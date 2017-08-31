package PierwszaPaczka;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DzienCzwartySekwencje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Listy
		
	/*	ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Ala");
		lista.add("Ola");
		lista.add("Ala");
		for(String s:lista) {
			
		
		System.out.print(s + " ");
		}
		System.out.println("\nwielkoœæ listy: " + lista.size());
		lista.remove(1);
		System.out.println(lista);
		lista.remove("Ala");
		System.out.println(lista);
		lista.set(0, "Ela");					//modyfikacja
		System.out.println(lista);
		//lista.set(1, "Ola");
		lista.add(0,"Ala");
		System.out.println(lista);
		
		//HashSet
		
		HashSet<Integer> zbior = new HashSet<Integer>();
		zbior.add(2);
		System.out.println(zbior);
		zbior.add(3);
		zbior.add(4);
		zbior.add(5);
		zbior.add(4);
		System.out.println(zbior);
		
		HashSet<Integer> zbior2 = new HashSet<Integer>();
		zbior2.addAll(zbior);
		System.out.println(zbior);
		System.out.println(zbior2);
		HashSet<String> zbior3 = new HashSet<String>();
		System.out.println(zbior3);
		zbior3.add("A");
		zbior3.add("B");
		zbior3.add("D");
		zbior3.add("C");
		System.out.println(zbior3);
		System.out.println(zbior3.contains("D"));
		System.out.println(zbior2.contains(5));
		System.out.println(zbior3.size());
		System.out.println(zbior3.remove("D"));
		System.out.println(zbior3);
		zbior3.clear();
		System.out.println(zbior3.isEmpty());
		
		//mapy
		
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		mapa.put(10, "dziesiec");
		mapa.put(14, "czternascie");
		mapa.put(15, "pietnascie");
		System.out.println(mapa.get(10));
		System.out.println(mapa.get(11)); //jak nie ma to null
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		mapa.remove(15);
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa);
		System.out.println(mapa.size());
		
		
		//kolejki
		
		ArrayDeque<String> stos = new ArrayDeque<String>();
		stos.add("napis1");
		stos.add("napis2");
		stos.add("napis3");
		System.out.println(stos);
		stos.addLast("napis koñcowy");
		stos.addFirst("napis poczatkowy");
		System.out.println(stos);
		String a = stos.pollFirst(); //wydobywa nap pocz i usuwa go ze stosu
		System.out.println(a);
		String b = stos.getLast(); //wydobywa koncowy ale nie usuwa
		System.out.println(b);
		System.out.println(stos);
		stos.remove("napis2");
		System.out.println(stos);
		*/
		
		
		//J49
		/*Scanner input = new Scanner(System.in);
		System.out.println("wpisuj kolejne s³owa (end);-wyjscie");
		ArrayList<String> lista = new ArrayList<>();
		
		
		
		String ss = input.nextLine();
		while(!ss.equals("end")) {
			
				lista.add(ss);
				ss = input.nextLine();
			}
		System.out.println(lista);
		input.close();*/
		
		//J50 i J51
		
		//Napisz program który bêdzie wyœwietla³ cenê produktu w zale¿noœci od podanej nazwy produktu. 
		//I bêdzie sumowa³ zakupione towary. Do czasu a¿ u¿ytkownik wpiszê s³owo „koniec” po czym wyœwietli sumê do zap³aty.
		//Produkty:
		//Mleko, jajka, chleb, m¹ka, cukier, bu³ki, pomidory, woda, pomarañcze, ser
		//Ceny dowolne.
		
		//Do poprzedniego æwiczenia dodaj funkcjonalnoœæ wykrywania tego ¿e produkt jest ju¿ w koszyku. 
		//I zapytaj o potwierdzenie u¿ytkownika czy na pewno chce dodaæ ponownie ten produkt.
		
		//skopiowaæ i rozkminiæ!!! <<<<<<<<<<<<<<<<<<<<
		
		/*Scanner rl = new Scanner(System.in);
		Scanner xl = new Scanner(System.in);
		HashMap<String, Double> mapa = new HashMap<String, Double>();
		ArrayList<String> lista = new ArrayList<String>();
		mapa.put("chleb", 1.23);
		mapa.put("mleko", 2.99);
		mapa.put("jaja", 3.99);
		mapa.put("m¹ka", 3.99);
		mapa.put("cukier", 3.99);
		mapa.put("bu³ki", 3.99);
		mapa.put("pomidory", 3.99);
		mapa.put("woda", 3.99);
		mapa.put("pomarañcze", 3.99);
		mapa.put("ser", 3.90);
		
		float sum = 0;
		System.out.println("Podaj nazwê produktu: ");
		String rr = rl.nextLine();		
		while( (!rr.equals("end")) && (!rr.equals("END")) ){
			if(mapa.containsKey(rr) && !lista.contains(rr)){
				sum += mapa.get(rr);
				lista.add(rr);
			} else if(mapa.containsKey(rr) && lista.contains(rr)){
				System.out.println("Czy na pewno chcesz dodaæ ten produkt(t/n)?: ");
				String xx = xl.nextLine();
				if (xx.equals("t")){
					sum += mapa.get(rr);
					lista.add(rr);	
				}
			} else {
				System.out.println("Z³a nazwa produktu: ");
			}
			rr = rl.nextLine();
		}
		System.out.println("Cena za twoje zakupy: " + sum + "z³");
		rl.close();
		xl.close();*/

		//J46
		/*System.out.println("Podaj liczbê do przekszta³cenia na kod binarny: ");
		Scanner input = new Scanner(System.in);
		
		
		int liczba = input.nextInt();
		
		int licznik = 0;													//rozkminiæ!!!<<<<<<<<<<<<<<<<<<<<<
		
		int[] tablica = new int[32];
		do {
			if(liczba%2==0) {
				liczba = liczba/2;
				tablica[licznik++]=0;
			}
			else {
				liczba = liczba/2;
				tablica[licznik++]=1;
			}
		}
			while(liczba>0);
				System.out.println("Twoja liczba binarnie to: " );
				for(int i= tablica.length-1; i>0; i--) {
					if(licznik>=i) {
						System.out.println(tablica[i]);
						}
					else {
						System.out.println(0);
					}
				}
				input.close();*/
			
			//lub alternatywne rozwi¹zanie
				
		/*System.out.println("Podaj liczbê do przekszta³cenia na kod binarny: ");
		Scanner input = new Scanner(System.in);
				
		int liczba = input.nextInt();
																	//rozkminiæ!!!<<<<<<<<<<<<<<<<<<<<<
		int[] tablica = new int[32];
				
				for(int i=tablica.length-1; i>=0; i--) {
					if(liczba%2 != 0) {
						tablica[i] = 1;
						}
					liczba /= 2;
				}
				for(int i : tablica) {
					System.out.print(i);
				}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
