import java.util.Scanner;

class HelloWorld {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system.out.printIn("Hello world!");
		/*System.out.println((1+3)/(4+6)-7/45+2);
		System.out.println((1+3)/(4+6)-7/(45+2));
		System.out.println(1+3/(4+6-7/45+2));
		System.out.println((1+3)/(4+6-7/(45+2)));
		System.out.println(1+2/(3+4/5));
		System.out.println(1+3/(4+6)-7/(45+2));*/
		
		
		/*System.out.println("\t     2");
		System.out.println("1 + ------------------- = 1");
		System.out.println("\t     4");
		System.out.println("\t3 + ---");
		System.out.println("\t     5");*/
		
		
		/*System.out.println("Ala" + ' ' + "ma" + 4 + "koty");
		System.out.println('x'-'x'+5);
		System.out.println('x'+'x'+'x'+5/8);
		System.out.println('z'-'z'+5.0/8);
		System.out.println(4+5+"tekst");
		System.out.println(4+"teksty na" + 5);
		System.out.println("teksty"+4+5);
		System.out.println("Ala" + ' ' + "ma" + 4 + "koty");*/
		
		
		/*System.out.println("telefon: ");
		System.out.println("telefon: "+45+'-'+61+'-'+73);
		
		System.out.println("suluap\'s homework directory: "+'\\' + "home\t" + '\\'+"prg\b"+'\\'+"java\n");*/
		
		/*System.out.println("Nad. Matylda\n\n");
		System.out.println("\t\t\t\tSz.P.");
		System.out.println("\t\t\t\tSuluap Krasnoludzki");
		System.out.println("\t\t\t\tul. Bajkowy Staw 16");
		System.out.println("\t\t\t\t01-238 Warszawa");*/
		
		/*System.out.println("\t\t\t\t o");
		System.out.println("\t\t\t       xx/xx");
		System.out.println("\t\t\t     xxx///xxx");
		System.out.println("\t\t\t    xxx/////xxx");
		System.out.println("\t\t\t   xxxx/////xxxx");
		System.out.println("\t\t\t  xxxx///////xxxx");
		System.out.println("\t\t\t xxxxx///////xxxxx");
		System.out.println("\t\t\t xxxxx///////xxxxx");
		System.out.println("\t\t\txxxxxx///////xxxxxx");
		System.out.println("\t\t\txxxxxx///////xxxxxx");
		System.out.println("\t\t\tx     /  o  /     x");
		System.out.println("\t\t\t         o         ");
		System.out.println("\t\t\t         o         ");
		System.out.println("\t\t\t         o         ");
		System.out.println("\t\t\t         o         ");
		System.out.println("\t\t\t         o         ");
		System.out.println("\t\t\t      o  o         ");
		System.out.println("\t\t\t     o   o         ");
		System.out.println("\t\t\t     o   o         ");
		System.out.println("\t\t\t      oo           ");*/
		
		/*int a = 3;
		System.out.println((2+a+4+5)/(2*2+1.0)+(2+3+4+5)/(3*3+1.0)+(2+3+4+5)/(4*4+1.0)+(2+3+4+5)/(5*5+1.0));
		*/
		
/*		String imie = "Kamil";
		String nazwisko = "Olejniczak";
		String ulica = "Cisowa ";
		String nrDomu = "3B";
		int nrMieszkania = 5;
		String kod = "65-960";
		String miasto = "Zielona Góra";
		
		System.out.println("--------------------------------");
		System.out.println("Sz.P.");
		System.out.println("     "+imie+" "+nazwisko);
		System.out.println("     "+ulica+" "+nrDomu+"/"+nrMieszkania);
		System.out.println("     "+kod+" "+miasto);
		double a = 2.533333;
		System.out.println(a+"--------------------------------");*/
		
		
		/*int x = 1;
		int y = 0;
		double x4=x*x*x*x;
		double x2=x*x;
		int y2=y*y;
		int y4=y*y*y*y;
		double sumA = ((x4*y4+x2*y2)/(x2+2*x*y+y2))+(x+y)/(x4+y4+1);
		double sumB = (((x2+2*x*y+y2)+2)/(x4*y4+x2*y2+1));
		System.out.println(sumA);
		System.out.println(sumB);
		
		System.out.println(sumA/sumB);*/
		
		/*int result = 0;
		for(int i = 0; i<5; i++) {
			if(i == 3) {
				result += 10;
			}else {
				result += i;
			}
		}
		System.out.println(result);
		
		*/
		
	/*	Scanner input = new Scanner(System.in);
		String g1, g2, g3;
		g1 = input.nextLine();
		g2 = input.nextLine();
		g3 = input.nextLine();
		System.out.println("\t"+g1);
		System.out.println("\t"+g2);
		System.out.println("\t"+g3);
		System.out.println("\tvvvvvvvvvvvvv");
		System.out.println("\t vvvvvvvvvvv");
		System.out.println("\t  vvvvvvvvv");
		System.out.println("\t   vvvvvvv");
		System.out.println("\t    vvvvv");
		System.out.println("\t     vvv");
		System.out.println("\t      v");
		input.close();*/
		
		/*System.out.println();
		Scanner input = new Scanner(System.in);
		float vat0=0.0f, vat7=0.07f, vat22=0.22f;
		System.out.println("Podaj kwotê netto A: ");
		int nettoA = input.nextInt();
		System.out.println("Podaj kwotê netto B: ");
		int nettoB = input.nextInt();
		System.out.println("Podaj kwotê netto C: ");
		int nettoC = input.nextInt();
				
		double bruttoA = nettoA+nettoA*vat0;
		double bruttoB = nettoB+nettoB*vat7;
		double bruttoC = nettoC+nettoC*vat22;
		
		double vatB = bruttoB-nettoB;
		double vatC = bruttoC-nettoC;
		double sum = bruttoA+bruttoB+bruttoC;
		System.out.println("-----------------------");
		System.out.println("Rachunek: ");
		System.out.println("-----------------------");
		System.out.println("VAT 7%: " +vatB);
		System.out.println("VAT 22%: " +vatC);
		System.out.println("Do zap³aty: " + sum+"z³");*/
		
		/*Scanner input = new Scanner(System.in);
		int kredyt;
		int procent;
		int okres;
		System.out.print("Podaj kwotê kredytu: ");
		kredyt = input.nextInt();
		System.out.print("Podaj stopê procentow¹: ");
		procent = input.nextInt();
		System.out.print("Podaj na ile rat ma byæ roz³o¿ony kredyt: ");
		okres = input.nextInt();
		double czescSR = kredyt/okres;
		System.out.println("Czêœæ sta³a raty wynosi: "+czescSR+"z³");
		double odsetki;
		System.out.println("odsetki: ");
		int sum = 0;
		for(int i=0; i<=okres-1; i++) {
				odsetki = (kredyt-czescSR*i)*procent/100/12;
				sum +=odsetki;
			System.out.println(odsetki);	
		}
		input.close();
		System.out.println("Suma: kapita³ + odsetki: " +(kredyt)+" + " + (sum)+" = "+(kredyt+sum));*/
		
		Scanner sc = new Scanner(System.in);
		int tabela[] = new int[3];
		for(int i = 0; i<tabela.length; i++) {
		System.out.println("Podaj liczbê");
		tabela[i] = sc.nextInt();
			
		}
		for(int i=0; i<= tabela.length-1; i++) {
		System.out.print(tabela[i]);
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
