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
			System.out.println("Podaj element tablicy, (Q)-wyj�cie");
			dec = sc.nextLine();
			if(dec.equals("Q")){
				System.out.println("Wyj�cie");
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
			System.out.println("Nie mo�na wprowadzi� wi�cej element�w do tablicy");
			sc.nextLine();
			break;
		}
		}
		while(true){
			try{
			System.out.println("Wybierz kt�ry element tablicy chcesz wy�wietli�, (0)-wyj�cie");
			index = sc.nextInt();
			if(index==0){
				System.out.println("Wyj�cie");
				break;
			}
			if(index > i){
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println(liczby[index-1]);
			}catch(InputMismatchException e){
				System.out.println("Nale�y poda� liczb�");
				sc.nextLine();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Podany nr indexu wykracza poza rozmiar tablicy");
				sc.nextLine();
			}
		}
		sc.close();
	}
}