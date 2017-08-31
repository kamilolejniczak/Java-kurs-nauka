package Abstrakcyjna;

public class KontoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KontoBank1 k = new KontoBank1();
		k.addDebit();
		k.addSaldo(100);
		k.subbSaldo(1000);
		k.interest(1234, 500);
		
		
	}

}
