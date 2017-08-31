package Abstrakcyjna; 				//J71

public abstract class KontoBankowe {
	int nrKonta;
	float saldo;
	
	
	public float addSaldo(float kwota){
		return this.saldo = saldo + kwota;
	}
	public float subbSaldo(float kwota){
		return this.saldo = saldo - kwota;
	}
	public abstract void interest(int nrKonta, float saldo);
	public abstract void addDebit();
	
}
