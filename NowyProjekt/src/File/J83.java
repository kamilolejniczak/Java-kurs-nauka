package File;	//J83

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class J83 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File plik = new File("plik1.txt");
		Scanner odczyt = new Scanner(System.in);
		PrintWriter zapis = new PrintWriter(plik);
		String koniec = "";
		System.out.println("wpisz kolejne linie do pliku: ");
		while(!koniec.toLowerCase().equals("koniec")){
			koniec = odczyt.nextLine();
			if(!koniec.toLowerCase().equals("koniec")){
			zapis.println(koniec);
			}
		}
		zapis.close();
		Scanner odczyt2 = new Scanner(plik);
		while(odczyt2.hasNextLine()){
			System.out.println(odczyt2.nextLine());
		}
		
		odczyt.close();
		odczyt2.close();
		
		
		
		
		
		
	}

}
