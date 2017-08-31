package PierwszaPaczka;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class DzieñDrugi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int x = 5;
		double y = 9.0;
											//funkcje matematyczne
		double pierwiastek = sqrt(y);
		double potega = pow(y, x);
		
		System.out.println("Pierwiastek z " + y + "wynosi: " + pierwiastek);
		System.out.println("Liczba " + y + "podniesiona do potegi " + x + "to: " + potega);*/
		
		//skopiowaæ bigInteger
		//valueOf(i) - met statyczna zamienia obiekt bigIntI
		
		
		/*BigInteger A = BigInteger.valueOf(372398798832982298l);
		BigInteger B = BigInteger.valueOf(986389468969462394l);
		
		System.out.println(A);
		
		BigInteger C = A.add(B);
		System.out.println(C);
		BigInteger D = A.subtract(B);
		System.out.println(D);
		BigInteger E = A.multiply(B);
		System.out.println(E);
		BigInteger F = B.divide(A);
		System.out.println(F);*/
		
		//J18
		
		/*int a = 3;
		int b = 4;
		double pierwiastek = sqrt(a);
		double potega = pow(a,b);
		System.out.println("pierwiastek z " + a + "rowna sie " + pierwiastek);
		System.out.println("potega " + b + a + potega);
		double poleKola = PI*pow(a,2);
		System.out.println(a + b + poleKola);
		double obwodOkregu = 2*PI*a;
		System.out.println(obwodOkregu);*/
		
		//scanner
		
		/*System.out.println("Wpisz imie: ");
		String imie;
		Scanner odczyt = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){};
		});
		imie = odczyt.nextLine(); //metoda która zczytuje nast linie
		System.out.println("Witaj " + imie);
		odczyt.close();
		Scanner odczyt2 = new Scanner(System.in);
		String imie2 = odczyt2.nextLine();
		System.out.println("Witaj " + imie2);
		odczyt2.close();*/
		
		//
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		input.useLocale(Locale.US);
		System.out.println("Podaj A: ");
		double a = input.nextDouble();
		input.nextLine();
		System.out.println("Podaj imie: ");
		String imie = input.nextLine();
		System.out.println("Witaj: " + imie);
		System.out.println("Podaj B: ");
		double b = input.nextDouble();
		input.close();
		System.out.println("A + B = " + (a+b));*/
		
		//J19
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj imie: ");
		String imie = input.nextLine();
		System.out.println("Witaj " + imie + " na kursie Javy");
		input.close();*/
		
		//J20
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj liczbê: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double srednia = (a+b+c)/3;
		System.out.println("Œrednia z :" + a +", " + b + ", " + c + " wynosi " + srednia);
		*/
		
		//J21
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj liczbê: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		System.out.print("b = ");
		double b = input.nextDouble();
		System.out.println("a == b  " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("a >= b " + (a > b));
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a < b);
		input.close();*/
		
		
		//J22
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj liczbê: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		//3a**2 pierw z 3 przez 2
		double pole = round(((3*(pow(a,2))*(sqrt(3)/2))*100)/100);
		System.out.println(pole);
		input.close();
		*/
		
		//J23
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj liczbê: ");
		System.out.print("x1 = ");
		double x1 = input.nextDouble();
		System.out.print("x2 = ");
		double x2 = input.nextDouble();
		System.out.print("y1 = ");
		double y1 = input.nextDouble();
		System.out.print("y2 = ");
		double y2 = input.nextDouble();
		double s = sqrt(pow((x1-x2),2)+pow(((cos((x1*PI)/180))*(y2-y1)),2));
		System.out.println(s*111);
		input.close();*/
		
		//J24
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj napis: ");
		System.out.print("napis = ");
		String a = input.nextLine();
		StringBuffer b = new StringBuffer(a);
		b.append("");
		System.out.println("napis: " + a + " odwrotnie to: " + b.reverse().toString());
		input.close();*/
		
		//J25
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj coœ: ");
		System.out.print("coœ = ");
		String a = input.nextLine();
		System.out.println(a.length());*/
		
		//===============================================================================
		//===============================================================================
		//zagnie¿dzone instrukcje if-else
		
	/*	int a = 100;
		int b = 10;
		int c = 50;
		
		if(a>b) {
			if(a>c) {
				System.out.println("A>B oraz A>C");
			}
			else {
				System.out.println("A<B oraz A<C");
			}
		}
		else if(a==c) {
			System.out.println("A==C");
		}
		else {
			System.out.println("A<B oraz A!=B");
		}*/
					
	//switch
		
		/*String ok = "1";
		
		switch(ok) {
		case "1":
			System.out.println("1");
			break;
		case "2":
			System.out.println("2");
			break;
		case "3":
			System.out.println("3");
			break;
			
		}*/
		
		
	//J26
		
		/*Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.print("Wprowadz pierwsz¹ liczbê \"x: " );
		float x = rl.nextFloat();
		rl.nextLine();
		System.out.print("Wprowadz znak dzia³ania matemtycznego ktore chcesz wykonaæ: " );
		String znak = rl.nextLine();
		System.out.print("Wprowadz drug¹ liczbê y: " );
		float y = rl.nextFloat();
		rl.nextLine();
		if(znak.equals("/")){
			System.out.println("Wynik x/y=" + (x/y));
		}
		else if (znak.equals("*")) {
			System.out.println("Wynik x*y=" + (x*y));
		}
		else if (znak.equals("+")) {
			System.out.println("Wynik x+y=" + (x+y));
		}
		else if (znak.equals("-")) {
			System.out.println("Wynik x-y=" + (x-y));
		}
		else
			System.out.println("Wprowadziles zly znak");
		rl.close();*/
		
	//J27
		
		/*Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj liczbê od 0 do 1: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		
		if(a>=0 && a<=1) {
			System.out.println("liczba jest w przedziale");
		}
		else {
				System.out.println("poza przedzia³em");
			}
		input.close();*/
		
	//J28
		
		/*Random b = new Random();
		int x = b.nextInt(6);
		int y = b.nextInt(6);
		int z = b.nextInt(6);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		Scanner input = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		System.out.println("Podaj liczbê: ");
		System.out.print("a = ");
		double a = input.nextDouble();
		
		if(x>a) {
		System.out.println("liczba x jest wieksza od zadanej" + a);
		}
		else if(x<a) {
			System.out.println("liczba x jest mniejsza od zadanej" + a);
		}
		else {
			System.out.println("liczba x jest równa z zadan¹" + a);
		}
		if(y>a) {
			System.out.println("liczba y jest wieksza od zadanej" + a);
			}
		else if(y<a) {
				System.out.println("liczba y jest mniejsza od zadanej" + a);
			}
		else {
				System.out.println("liczba y jest równa z zadan¹" + a);
			}
		if(z>a) {
				System.out.println("liczba z jest wieksza od zadanej" + a);
				}
		else if(z<a) {
					System.out.println("liczba z jest mniejsza od zadanej" + a);
				}
		else {
					System.out.println("liczba z jest równa z zadan¹" + a);
				}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
