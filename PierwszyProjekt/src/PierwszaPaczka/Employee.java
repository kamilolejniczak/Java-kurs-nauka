package PierwszaPaczka;		//J52

public class Employee {

	String imie, nazwisko;
	int rokUrodzenia, stazPracy;
	
	Employee (String imie,
			String nazwisko,
			int rokUrodzenia,
			int stazPracy) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.stazPracy = stazPracy;
	}
	
	public String info() {
		return "Pracownik: " + imie + " " +nazwisko+ " (rok urodzenia: " + rokUrodzenia+ ",sta¿:  " + stazPracy + " )";
	}
	
	
	

}
