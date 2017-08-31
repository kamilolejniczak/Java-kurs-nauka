package Dziedziczenie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NR"+" "+"nazwa\t"+"model\t\t"+"seria\t"+"rozmiar\t"+"szerokosc\t"+"wysokosc");
		System.out.println("---------------------------------------------------------------------------------");
		Opony o1 = new Opony("michelin","contact","a1",18, 155, 60);
		System.out.println(o1.NR+" "+o1.nazwa+" \t"+o1.model+" \t"+o1.seria+" \t"+o1.rozmiar+" \t"+o1.szerokosc+" \t\t"+o1.wysokosc);
		Felgi f1 = new Felgi("Ronal","BBS","a2",18);
		System.out.println(f1.NR+" "+f1.nazwa+" \t"+f1.model+" \t\t"+f1.seria+" \t"+f1.cale);
		Spaliny s1 = new Spaliny("Kopciuch","Smoluch","a3", false);
		System.out.println(s1.NR+" "+s1.nazwa+" \t"+s1.model+" \t"+s1.seria+" \t"+s1.standard);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
