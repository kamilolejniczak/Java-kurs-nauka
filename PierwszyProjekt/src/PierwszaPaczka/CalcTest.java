package PierwszaPaczka;					//J55

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator o1 = new Calculator();
		System.out.println(o1.dodaj(2,3));
		System.out.println(o1.dodaj(2,3,4));
		System.out.println(o1.dodaj(2.22,3.22));
		System.out.println(o1.dodaj(2.22,3.22,4.44));
		
		
		
		System.out.println(o1.odejmij(2,3));
		System.out.println(o1.odejmij(2,3,4));
		System.out.println(o1.odejmij(2.22,3.22));
		System.out.println(o1.odejmij(2.22,3.22,4.44));
		
		o1.printType(o1.dodaj(2,3));
		o1.printType(o1.dodaj(2.22,3.22));
		o1.printType(o1.odejmij(2.22,3.22));
		o1.printType(o1.odejmij(2.22,3.22,4.44));
		System.out.println();
	}

}
