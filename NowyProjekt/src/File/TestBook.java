package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<Book> myBooks = new ArrayList<>();
		File myFile = new File("book1.txt");
		Scanner odczyt = new Scanner(myFile);
		
		odczyt.useDelimiter(",|\r?\n");
		
		while(odczyt.hasNextLine()) {
			String odczytNazwa = odczyt.next();
			String odczytAutor = odczyt.next();
			String odczytRok = odczyt.next();
			
			Book nextBook = new Book(odczytNazwa,odczytAutor,odczytRok);
			myBooks.add(nextBook);
		}
		System.out.println("moje ksiazki: ");
		System.out.println("==================================================");
		for(Book b : myBooks){
			System.out.println("Nazwa:\t " + b.getNazwa()+"\nAutor:\t "+b.getAutor()+"\nRok:\t " + b.getRok());
			System.out.println("==================================================");
		}
		
		odczyt.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
