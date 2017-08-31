package Gatunki;				//J61, J62, J63
import java.util.ArrayList;
import java.util.Scanner;

public class Gatunek {

	String nazwaGatunku, rodzaj;
	int liczcbaChromosomow;
	
	Chromosom[] tabChromosomow; 	
	
	static ArrayList<Gatunek> listaGatunkow = new ArrayList<>();
	
	public Gatunek(String nazwaGatunku, String rodzaj, int liczcbaChromosomow) {
		
		super();
		this.nazwaGatunku = nazwaGatunku;
		this.rodzaj = rodzaj;
		
		this.liczcbaChromosomow = liczcbaChromosomow;
		
		this.tabChromosomow = new Chromosom[liczcbaChromosomow];
		
		//uzupe³nianie tabeli z chromosomami
		//Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < tabChromosomow.length; i++) {
			
			System.out.println("podaj d³ugoœæ: "+ (i+1) +" chromosomu: ");
			int dc = scan.nextInt();
			scan.nextLine();
			
			tabChromosomow[i] = new Chromosom(i+1, dc);
		}
		scan.close();
		
		listaGatunkow.add(this);
	}
	
	public String printChromosomy() {
		
		String strChromosomy = "";
		
		for(int i = 0; i < this.tabChromosomow.length; i++) {
			strChromosomy = strChromosomy + "chromosom: " + (i+1) + "\td³ugoœæ: "+this.tabChromosomow[i].dlugoscRamieniaChromosomu+"\n";
		}
		
		return strChromosomy;
	}
	

	public String printRodzajGatunek() {
		return "rodzaj: " + this.rodzaj + " gatunek: " + this.nazwaGatunku;
	}

	public String printLiczbaChromosomów() {
		return "liczba chromosomów: " + this.liczcbaChromosomow;
	}
	
	public String printWszystkieDane() {
		return  this.printRodzajGatunek() +"\n"+
				this.printLiczbaChromosomów()+"\n" + this.printChromosomy();
	}
	
	public void wypiszGatunki() {
		for(Gatunek v : listaGatunkow) {
			if(v.rodzaj.equals(this.rodzaj)){
				System.out.println(v.printWszystkieDane()+"\n");
			}
		}
	}
	
	public void wypiszRodzaj(String rodzaj) {
		for(Gatunek v : listaGatunkow) {
			if(v.rodzaj.equals(rodzaj)){
				System.out.println(v.printWszystkieDane()+"\n");
			}
		}
	}
	
	public void wypiszWszystko() {
		for(Gatunek v : listaGatunkow) {
			System.out.println(v.printWszystkieDane()+"\n");
		}
	}
	
	// metoda main
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		Gatunek gatunek = new Gatunek("","",0);
		
		String q = "";
		while(!q.equals("esc")) {
			System.out.println("Co chcesz zrobiæ?\n(1) "
					+ "- dodaj gatunek\n(2) "
					+ "- wypisz gatunki dal podanego rodzaju\n(3)"
					+ "- wypisz wszystko\n(esc) - koniec programu");
			q = scan1.nextLine();
		
			//Dodawanie gatunku
			if(q.equals("1")) {
				System.out.println("podaj rodzaj: ");
				String rodz = scan1.nextLine();
				System.out.println("podaj gatunek: ");
				String gat = scan1.nextLine();
				System.out.println("podaj liczbê chromosomów: ");
				int liczbaChr = scan1.nextInt();
				scan1.nextLine();
				
				gatunek = new Gatunek(gat, rodz, liczbaChr);
			}
			//Wypisywanie garunków
			else if(q.equals("2")) {
				System.out.println("Podaj nazwê rodzaju którego gatunki chcesz wypisaæ");
				String rodzaj = scan1.nextLine();
				gatunek.wypiszRodzaj(rodzaj);	
			}
			else if(q.equals("3")) {

				gatunek.wypiszWszystko();
			}
			else if(!q.equals("esc")) {
				System.out.println("nie rozumiem polecenia");
			}		
	}
		scan1.close();	


		
		
		
		
		
		
		
		
		
		
		
	}

}
