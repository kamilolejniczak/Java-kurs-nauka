package PierwszaPaczka;  //J52

import java.util.ArrayList;

public class Company {
	
	ArrayList<String> al = new ArrayList<String>();
	Company(ArrayList<String> al) {					//konstruktor tak jak Auto(){}
		this.al = al;
	}
	public void szefInfo() {
		for(String p :al) {
			System.out.println(p);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> pracownicy = new ArrayList<String>();
		
		Employee p1 = new Employee("karol","w",1999,10);
		pracownicy.add(p1.info());
		Employee p2 = new Employee("michal","z",1995,15);
		pracownicy.add(p2.info());
		Employee p3 = new Employee("piotr","x",1980,25);
		pracownicy.add(p3.info());
		Company szef1 = new Company(pracownicy);
		szef1.szefInfo();
		
		/*for(String p : pracownicy) {
			System.out.println(p);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
