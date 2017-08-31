package Abstrakcyjna;

public class KontoBank2 extends KontoBankowe{

	public void interest(int nrKonta, float saldo) {
		System.out.println(nrKonta + " "+saldo);
	}
	public void addDebit() {
		System.out.println("nie uznajemy kont");
	}
	
}
