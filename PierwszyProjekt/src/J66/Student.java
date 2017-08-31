package J66;

public class Student {

	private String imie, nazwisko;
	private int nrIndeksu;
	public static int id;
	
	public Student(String imie,
			String nazwisko,
			int nrIndeksu) {
		id++;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrIndeksu = nrIndeksu;
		System.out.println("Mamy ju¿: " + id + " studentów");
	}
	
}
