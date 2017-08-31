package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorTest {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String dec;
			Kalkulator c = new Kalkulator();
			
			while(true){
				System.out.println("Jak¹ operacjê chcesz wykonaæ? (+),(-),(*),(/),(Q)");
				dec = sc.nextLine(); 
				try{
				if(!(dec.equals("+") || dec.equals("-") || dec.equals("*") || dec.equals("/") || dec.equals("Q"))){
					throw new InputMismatchException();
				}
				} catch (InputMismatchException e){
					System.out.println("Z³y wybór jeszcze raz");
				}
				
				if(dec.equals("+")){
					try{
					System.out.println("Podaj A: ");
					double a = sc.nextDouble();
					c.setA(a);
					System.out.println("Podaj B: ");
					double b = sc.nextDouble();
					c.setB(b);
					System.out.println("Wynik dzia³ania: " + c.add(a, b));
					} catch (InputMismatchException e){
						System.out.println("B³êdny typ danych - podaj liczby zmiennoprzecinkowe");
						sc.nextLine();
					}
				} else if (dec.equals("-")){
					try{
					System.out.println("Podaj A: ");
					double a = sc.nextDouble();
					c.setA(a);
					System.out.println("Podaj B: ");
					double b = sc.nextDouble();
					c.setB(b);
					System.out.println("Wynik dzia³ania: " + c.sub(a, b));
					} catch (InputMismatchException e){
					System.out.println("B³êdny typ danych - podaj liczby zmiennoprzecinkowe");
					sc.nextLine();
					}
				} else if (dec.equals("*")){
					try{
					System.out.println("Podaj A: ");
					double a = sc.nextDouble();
					c.setA(a);
					System.out.println("Podaj B: ");
					double b = sc.nextDouble();
					c.setB(b);
					System.out.println("Wynik dzia³ania: " + c.multi(a, b));
					} catch (InputMismatchException e){
						System.out.println("B³êdny typ danych - podaj liczby zmiennoprzecinkowe");
						sc.nextLine();
					}
				} else if (dec.equals("/")){
					try{
					System.out.println("Podaj A: ");
					double a = sc.nextDouble();
					c.setA(a);
					System.out.println("Podaj B: ");
					double b = sc.nextDouble();
					if(b == 0){
						throw new ArithmeticException();
					}
					c.setB(b);
					System.out.println("Wynik dzia³ania: " + c.div(a, b));
					} catch (InputMismatchException e){
						System.out.println("B³êdny typ danych - podaj liczby zmiennoprzecinkowe");
						sc.nextLine();
					} catch (ArithmeticException e){
						System.out.println("Dzielenie przez zero jest zabronione");
						sc.nextLine();
					}
				} else if (dec.equals("Q")){
					System.out.println("Koniec");
					break;
				}
			}
			sc.close();
	}
}
