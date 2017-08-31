package PierwszaPaczka;

import java.util.Random;

public class Zmienne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int liczba1 = 5;
		int liczba2 = liczba1;
		System.out.println(liczba1+liczba2);
		double liczba3, liczba4;
		liczba3 = 5.0;
		liczba4 = 3.3;
		System.out.println(liczba3);
		System.out.println(liczba4);*/
		
//		sta³a
		
		/*final int Stala_int = 0;
		Stala_int = 9; //final + typ oznacza ¿e nie mo¿na póiej zmieniæ wartoœci przypisanej
*/	
		
		// kolejne zadanie
		
		/*String firstName;
		String lastName = "O";
		firstName = "Kamil";
		final String pesel = "12345678";
		int age = 30;
		double height = 175;
		System.out.println("Czeœæ ");
		System.out.print(firstName);
		System.out.print("  ");
		System.out.println(lastName);
		System.out.println("Inf:  ");
		System.out.println("Twój pesel to:  ");
		System.out.println(pesel);
		System.out.println("Masz  ");
		System.out.print(age);
		System.out.println("lat");
		System.out.println("Wzrost ");
		System.out.print(height);
		System.out.println(" cm ");*/
		
		
		
		/*String name = "Kamil";
		String lname = "O";
		int wiek = 30;
		int pesel = 1234;
		final String Kraj = "POL" ;
		final int Ocena = 4;
		
		System.out.print(name + " ");
		System.out.println(lname);
		System.out.println("wiek " + wiek + "lat");
		System.out.println("pesel: " + pesel);
		System.out.println("Kraj " + Kraj);
		System.out.print("Ocena " + Ocena);*/
		
		
		// typ String
		
		/*String hello = "Witaj ";
		String world = "Œwiecie!";
		String powitanie = hello+world;
		System.out.println(powitanie);
		
		String czesc = powitanie.substring(0, 6) + "uczniu";//wyciaga kawalek z powitania(0,6) od 1 znaku do 6znaku
		System.out.println(czesc);*/
		
		
		//test metody string
		
		/*String words = " Jeden dwa trzy cztery piêæ szeœæ siedem";
		String sub1 = words.substring(6,  7);
		String sub2 = words.replaceAll("dwa", "hehe");
		String sub3 = words.trim();
		char charat = words.charAt(2);
		System.out.println(words);
		System.out.println("words.substring(2, 7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hee\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		StringBuffer nowyBufor = new StringBuffer(words);
		nowyBufor.append("dodany ci¹g znaków");
		System.out.println(nowyBufor.toString());*/
		
		
		//kolejne cwiczenie
		
		
		/*String a = "Ala ";
		String b = "ma ";
		String c = a + b;
		String d = c + "kotka";
		System.out.println(c.toUpperCase());
		System.out.println(d.toLowerCase());
		
		
		
		//kolejne 9 cwiczenie
		
		System.out.println(d.length());
		System.out.println(c.charAt(2));
		System.out.println(c.charAt(5));
		System.out.println(d.charAt(d.length()-3));
		
		
		//kolejne cwiczenie 10
		
		
		System.out.println(a.length()+b.length());
		System.out.println(d.substring(0,a.length()+b.length()));
		System.out.print(d.substring(0,a.length()) + d.substring(a.length(),7));*/
		
		//operacje na zmiennych
		
		/*int a = 17;
		double b = 4;
		double c = a+b;
		System.out.println(c);
		c =a-b;
		System.out.println(c);
		c = a*b;
		System.out.println(c);
		c = a/b;
		System.out.println(c);
		a /= b;
		System.out.println(a);
		a += b;
		System.out.println(a);
		a -= b;
		System.out.println(a);
		a *= b;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);*/
		
		
		//logiczne
		
		
		/*int x =5;
		int y = 10;
		System.out.println("x>y" + (x>y));
		System.out.println("x<y" + (x<y));
		System.out.println("x!=y" + (x!=y));
		System.out.println("x==y" + (x==y));
		boolean instance = "Kasia" instanceof String;
		System.out.println(instance);*/
		
		
		//operatory logiczne
		
		
		/*int x =5;
		int y = 10;
		System.out.println("x>y" + (x>y));
		System.out.println("x<y" + (x<y));
		System.out.println("x!=y" + (x!=y));
		System.out.println("x==y" + (x==y));
		
		System.out.println(!(x>y));
		System.out.println((x>y) || (x<y));
		System.out.println((x>y) && (x<y));
		int wynik = x<y?x:y;//jesli x<y jest prawda to zwroc x jesli falsz zwroc y
		System.out.println(wynik);*/
		
		
		//konwersja
		
		/*char letter1 = 'k';
		char letter2 = 'o';
		char letter3 = 't';
		System.out.println("B³êdne \"sumowanie \" znaków");
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);
		System.out.println(letter1+letter2+letter3);
		System.out.println("Tekst jawny");
		System.out.println("" + letter1+letter2+letter3);
		
		letter1++;
		letter2++;
		letter3++;
		System.out.println("Tekst zaszyfrowany");
		System.out.println("" + letter1+letter2+letter3);
		letter1--;
		letter2--;
		letter3--;
		System.out.println("Tekst rozszyfrowany");
		System.out.println("" + letter1+letter2+letter3);
		//int a = 5;
		double b = 5.5;
		System.out.println((int)b);
		int c = (int)(a/b);
		System.out.println(c);*/
		
		//konwersja rzutuj¹ca 
		
		/*double number1 = 10.987;
		int number2 = 5;
		int narrowing = (int)number1;
		double widening = (double)number2;
		System.out.println("Narrowing: " +narrowing);
		System.out.println("widening: " +widening);*/
		
		//
		/*String ala = "Ala";
		String ala2 = "Ala";
		String kot = "Kot";
		System.out.println(ala==ala2);*///equals - porównuje ci¹g znaków. bez equals porównuje obiekty a nie ci¹g
		
		//
		/*float a = 10.2f;
		float b = 5.2f;
		System.out.println((int)(a/b));*/
		
		//
		/*int a = 5;
		int b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);*/
		
		/*System.out.println(-5+8*6);
		int a = 55+9;
		System.out.println(a%9);
		System.out.println(20+(-3*5)/8);
		System.out.println(5+(15/3*2)-8%3);*/
		
		/*int i = 1;
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);
		System.out.println(i++*5);*/
		
		//J16
		
		/*Random a = new Random();
		int x = a.nextInt(10);
		int y = a.nextInt(10);
		System.out.println(x+y);
		System.out.println(x>y);
		System.out.println((x*2)>y);
		System.out.println(y<(x+3) && y>(x-2));
		System.out.println((x*y)%2==0);
		*/
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		}

}
