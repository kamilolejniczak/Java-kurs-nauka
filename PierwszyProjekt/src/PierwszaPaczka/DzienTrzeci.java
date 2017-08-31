package PierwszaPaczka;

import java.util.Random;
import java.util.Scanner;

public class DzienTrzeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.println("Podaj ile razy chcesz wypisaæ tekst: ");
		
		int a = input.nextInt();
						
		for (int i =0; i<a; i++) {
			
				System.out.print("witaj ");
		}			
		input.close();*/
		
		/*Scanner n = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		System.out.println("Podaj ile razy chcesz wypisaæ tekst (max: 10)");
		int liczba = n.nextInt();
		
		String[] teksty = new String[liczba];
		
		for(int i = 0; i <= liczba-1; i++){
			System.out.println("Podaj tekst do wyœwietlenia");
			String text = txt.nextLine();
			teksty[i] = text;		
		}
		txt.close();
		int j = liczba-1;
		System.out.println("Z while");
		while(j >= 0){
			System.out.println(teksty[j]);
			j --;
		}
		System.out.println("Z for each");
		for(String var: teksty){
			System.out.println(var);
		}
		n.close();
		
		int[] liczby = new int[3];
		String[] napisy = new String[3];
		System.out.println(liczby[0]);
		System.out.println(napisy[1]);*/

		
		//zadanie J30
		
	/*	Scanner n = new Scanner(System.in);
		
		System.out.println("podaj liczbê ca³kowit¹: ");
		int liczba = n.nextInt();
		

		
		if(liczba>0) {
			for(int i = 0; i < liczba-1; i++) {
				if(i%2 != 0){
					System.out.println(i);
			}
		}
		}
			else {
				System.out.println("podana liczba musi byæ wiêksza od 0");
			}
		
		n.close();*/
		
		
		//J31
		
		/*Scanner nap = new Scanner(System.in);
		
		System.out.println("podaj nazwê zmiennej: ");
		System.out.println("pierwsza zmienna ");
		String napis1 = nap.nextLine();
		System.out.println("druga zmienna");
		String napis2 = nap.nextLine();
		
		char A = napis2.charAt(napis2.length()-3);
		
		String separator = String.valueOf(A);
		
		for(String res: napis1.split(separator)) {
			System.out.print(res+" ");
		}
		nap.close();*/
		
		
		
		//J32
		
		/*Scanner nap = new Scanner(System.in);
		
		System.out.println("Napisz wiek: ");
		System.out.println("wiek: ");
		int wiek = nap.nextInt();
		
		if(wiek>=18) {
			System.out.println("Mo¿esz g³osowaæ");
		}
		else {
			System.out.println("nie mo¿esz g³osowaæ");
		}
		nap.close();*/
		
		
		//J33
		
		/*Scanner napLiczba = new Scanner(System.in);
		
		System.out.println("Podaj napis: ");
		System.out.println("Podaj liczbê: ");
		System.out.println("napis: ");
		String napis  = napLiczba.nextLine();
		System.out.println("liczba: ");
		int liczba = napLiczba.nextInt();
		
		
		for(int i = 0; i<=napis.length()-1; i = i+liczba ) {
			System.out.println(napis.charAt(i));
		}
		napLiczba.close();*/
		
		
		//J34
		
		/*Scanner liczbaC = new Scanner(System.in);
		
		System.out.println("Podaj liczbê ca³kowit¹: ");
		int A = liczbaC.nextInt();
		System.out.println("liczba A: " + A);
		int B = liczbaC.nextInt();
		System.out.println("liczba2 B: " + B);
		
		int sum = 0;
		int i =0;
		
		if(A<B) {
			for(i=A; i<=B; i++) {
				sum += i;
				
			}
			System.out.println("Suma ci¹gu=" +sum);
		}
		liczbaC.close();*/
		
		//J35
		
		/*Scanner liczba = new Scanner(System.in);
		
		System.out.println("Podaj liczbê ca³kowit¹: ");
		int A = liczba.nextInt();
		System.out.println("liczba A: " + A);
		
		
		if(A>0) {
			for(int i=0; i <= A; i++) {
				System.out.println(Math.pow(2,i));
			}
		}
		liczba.close();*/
		
		//J36
		
		/*Scanner liczba = new Scanner(System.in);
		
		System.out.println("Podaj liczbê: ");
		
		System.out.println("liczba : ");
		
		int line = 0;
		int sum = 0;
		boolean hasZero = false;
		do {
			line = liczba.nextInt();
					if(line != 0) {
						sum += line;
						}
					else {
						hasZero = true;
					}
		} 
			while(!hasZero);
		
				System.out.println("suma = " +sum);
				
		liczba.close();*/
		
		//J38
		
		/*Random generator = new Random();
		Scanner rl = new Scanner(System.in);
		int res = (int)generator.nextInt(100);
		int proba;
		do{
			System.out.println("Podaj liczbe");
			proba = rl.nextInt();
			if(res < proba){
				System.out.println("Za duzo");
			} else if(res > proba){
				System.out.println("Za malo");
			} else {
				System.out.println("Gratulacje");
			}
		} while(proba != res);
		System.out.println("Szukana liczba to: " + res);
		rl.close();*/

		
		//J40
		
		/*Scanner liczba = new Scanner(System.in);
		System.out.println("podaj ");
		
		int a = liczba.nextInt();
		
		for(int w=0; w<a; w++) {
			for(int i = 1; i<=a - w ;i++) {
				System.out.print(" ");
	}
			for(int j = a; j>a - 2*w+1; j--) {
				System.out.print("*");
			}
		
			
		
		System.out.println();
		}
		for(int k=0; k<a - 1; k++) {
			System.out.print(" ");
		}
		System.out.print("*");
		liczba.close();*/
		
		//J41
		
		/*Scanner liczba = new Scanner(System.in);
		System.out.println("podaj ");
		
		int a = liczba.nextInt();
		if(a>0) {
			for(int i=1; i<a+1; i++) {
				if(a %i == 0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("liczba mniejsza od zera");
		}
		liczba.close();*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
