package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J81 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File plik = new File("C:\\Users\\olejn\\Desktop\\j81.txt");
		Scanner odczyt = new Scanner(plik);
		
		while(odczyt.hasNextLine()) {
			String line = odczyt.nextLine();
			String LC = line.toLowerCase(); //zmiana na male litery
			int licznikA = 0;
			int licznikO = 0;
			for(int i = 0; i < LC.length(); i++) {
				if(LC.charAt(i)=='a'){ //na indeksie zerowym sprawdzam czy rowna sie a
					licznikA++;
				}
				if(LC.charAt(i)=='o') {
					licznikO++;
				}
			}
			if((licznikA>=3 && licznikO>=2) || (LC.contains("allow"))) {
				System.out.println(line);
			}
		}
		odczyt.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
