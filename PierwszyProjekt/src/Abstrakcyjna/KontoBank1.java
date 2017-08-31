package Abstrakcyjna;

public class KontoBank1 extends KontoBankowe {

	@Override
	public void interest(int nrKonta, float saldo) {
		System.out.println(nrKonta + " "+saldo);
	}
	@Override
	public void addDebit() {
		System.out.println("nie uznajemy kont");
	}

}