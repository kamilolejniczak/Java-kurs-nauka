package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PlikiOperacje {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//odczyt
		File plik = new File("pliczek1.txt");
		
		Scanner odczyt = new Scanner(plik);
		String text1 = odczyt.nextLine();
		System.out.println(text1);
		String text2 = odczyt.nextLine();
		System.out.println(text2);
		odczyt.close();
		//zapis
		PrintWriter zapis = new PrintWriter(plik);
		zapis.println("Zawartosc zapisu");
		zapis.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
