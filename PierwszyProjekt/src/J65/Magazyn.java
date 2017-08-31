package J65;

import java.util.ArrayList;
import java.util.Scanner;

public class Magazyn {
	private String nazwa; 
	private int cena;
	private int ilosc;
	public int id = 1;
	public ArrayList<Magazyn> produkty = new ArrayList<Magazyn>();
	Scanner sc = new Scanner(System.in);
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public void zmienStan(){
		sc.nextLine();
		System.out.println("Podaj id produktu: ");
		id = sc.nextInt();
		System.out.println("Zmien iloœæ: ");
		produkty.get(id-1).setIlosc(sc.nextInt());
	}
	
	public void dodajProdukt(Magazyn m1){
		sc.nextLine();
		System.out.println("Podaj nazwê: ");
		m1.setNazwa(sc.nextLine());
		System.out.println("Podaj cenê: ");
		m1.setCena(sc.nextInt());
		System.out.println("Podaj iloœæ: ");
		m1.setIlosc(sc.nextInt());
		produkty.add(m1);
	}
	public void usunProdukt(Magazyn m1){
		System.out.println("Podaj id produktu do usuniêcia: ");
		id = sc.nextInt();
		produkty.remove(id-1);
		System.out.println("Produkt usuniêto!");
	}
	public void stanyProdukty(){
		int counter = 0;
		for(Magazyn m : produkty){
		System.out.println("id: " + counter++);
		System.out.println("Nazwa: " + m.getNazwa());
		System.out.println("Cena: " + m.getCena());
		System.out.println("Ilosc: " +m.getIlosc());
		System.out.println("==============================");
		}
	}

}
