package Polimorfizm;

public class TestPoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bakteria b = new Bakteria();
		b.przypiszDNA("abbccba");
		b.zmienSzkodliwosc("bardzo szkodliwosc");
		b.info();
		Zwierze z = new Zwierze();
		z.przypiszDNA("kkkkkkkk");
		z.zmienNogi(22);
		z.info();
		Roslina r = new Roslina();
		r.przypiszDNA("ddddddd");
		r.przypiszDNA("ggggggg");
		r.zmienDlodygi(5);
		r.info();
		
		
		
		
		
		
		
	}

}
