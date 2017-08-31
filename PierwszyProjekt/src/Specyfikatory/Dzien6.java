package Specyfikatory;
import Gatunki.*;
import Gatunki.Gatunek;


public class Dzien6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Gatunek a = new Gatunek("","",2);
		//a.wypiszGatunki();
		
		GetSet gs1 = new GetSet();
		System.out.println(gs1.getA());
		gs1.setA(15);
		System.out.println(gs1.getA());
		gs1.setC(true);
		System.out.println(gs1.isC());
		gs1.getZnaczek();
		System.out.println(gs1.getZnaczek());
		
	}

}
