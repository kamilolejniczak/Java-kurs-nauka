package J84;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) throws IOException{
		
		Scanner r1 = new Scanner(System.in);
		Company comp = new Company();
		
		File f1 = new File("firma.txt");
		
		Scanner odczyt = new Scanner(f1);
		String end = "";
		
		int i = 0;
		while(true){
			System.out.println("(1)-zapis, (2)-odczyt, (3)-koniec");
			end = r1.nextLine();
			if(end.equals("1")){				//zapis
				FileWriter w1 = new FileWriter(f1, true);
				while(i < comp.getPracownicy().length){
					Employee emp = new Employee();
					System.out.println("Podaj imiê pracownika: ");
					end = r1.nextLine();
					emp.setImie(end);
					w1.write(end+", ");
					
					System.out.println("Podaj nazwisko pracownika: ");
					end = r1.nextLine();
					emp.setNazwisko(end);
					w1.write(end+", ");
					
					System.out.println("Podaj wyp³atê pracownika: ");
					end = r1.nextLine();
					emp.setWyplata(end);
					w1.write(end+"\n");
					
					i++;
				}
				w1.close();
			}else if (end.equals("2")){			//odczyt
				Scanner rl1 = new Scanner(f1);
				while(rl1.hasNextLine()){
					System.out.println(rl1.nextLine());
				}
			}else if (end.equals("3")){			//wyjscie
				break;
			}
		}
		r1.close();
		
		
		
		
		
		
		
		
		
	}
}
