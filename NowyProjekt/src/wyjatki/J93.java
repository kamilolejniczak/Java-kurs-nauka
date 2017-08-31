package wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J93 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String path = "";
		boolean error = true;
		while(error){
			
			try{
				path = sc.nextLine();
				File testFile = new File(path);
				Scanner fsc = new Scanner(testFile);
				
				while(fsc.hasNextLine()){
					System.out.println(fsc.nextLine());
				}
				fsc.close();
				error = false;
			}catch(FileNotFoundException e){
				System.out.println("Z³a œcie¿ka. Jeszcze raz");
			}
		}
		sc.close();
	}

}
