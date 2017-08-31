package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TabliceWyjatki {

	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		String[] liczby = new String[10];
		String dec;
		int index;
		int i = 0;
		while(true){
			try{
			System.out.println("Podaj element tablicy, (Q)-wyjœcie");
			dec = sc.nextLine();
			if(dec.equals("Q")){
				System.out.println("Wyjœcie");
				break;
			}else{
				if(i != liczby.length){
					liczby[i] = dec;
					i++;
				}
				if(i==liczby.length){
					throw new ArrayIndexOutOfBoundsException();
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Nie mo¿na wprowadziæ wiêcej elementów do tablicy");
			sc.nextLine();
			break;
		}
		}
		while(true){
			try{
			System.out.println("Wybierz który element tablicy chcesz wyœwietliæ, (0)-wyjœcie");
			index = sc.nextInt();
			if(index==0){
				System.out.println("Wyjœcie");
				break;
			}
			if(index > i){
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println(liczby[index-1]);
			}catch(InputMismatchException e){
				System.out.println("Nale¿y podaæ liczbê");
				sc.nextLine();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Podany nr indexu wykracza poza rozmiar tablicy");
				sc.nextLine();
			}
		}
		sc.close();
	}
}