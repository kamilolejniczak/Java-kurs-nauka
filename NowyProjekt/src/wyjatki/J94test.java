package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J94test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J94 u1 = new J94();
		
		while(true){
		System.out.println("Podaj imie");
		try{
		String imie_sc = sc.nextLine();
		if(imie_sc.isEmpty()){
			throw new NullPointerException();
		}
		u1.setImie(imie_sc);
		break;
		} catch (NullPointerException e){
			System.out.println("Imie nie mo¿e byæ puste");
		}
		}
		while(true){
		System.out.println("Podaj nazwisko");
		try{
		String nazwisko_sc = sc.nextLine();
		if(nazwisko_sc.isEmpty()){
			throw new NullPointerException();
		}
		u1.setNazwisko(nazwisko_sc);
		break;
		} catch (NullPointerException e){
			System.out.println("nazwisko nie mo¿e byæ puste");
		}
		}
		while(true){
		System.out.println("Podaj wiek");
		try{
		int wiek_sc = sc.nextInt();
		u1.setWiek(wiek_sc);
		break;
		} catch (InputMismatchException e){
			System.out.println("Wiek musi byæ int");
			sc.nextLine();
		}		
		}
		System.out.println(u1.getImie() + u1.getNazwisko() + u1.getWiek());
		
		sc.close();

		
		
		
	}

}
