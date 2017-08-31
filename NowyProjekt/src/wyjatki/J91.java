package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean error = true;
		
		while(error){
			System.out.println("Podaj liczbê lub zakoñcz - Q");
			try{
			number = sc.nextInt();
			System.out.println("Poda³eœ liczbê: " +number);
			error = false;
		}catch(InputMismatchException e){
			if(sc.hasNext("Q")){
				break;
			}else{
			System.out.println("Nie poda³eœ liczby ca³kowitej. Popraw wartoœæ!");
			sc.nextLine();
			}
		}
			}
		sc.close();
	}

}
