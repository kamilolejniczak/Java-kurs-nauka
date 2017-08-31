package Interface;

public class HumanTest implements Humanoid, Animal{

	public String imie, nazwisko;
	
	public HumanTest(String imie,
				String nazwisko) {
		this.imie=imie;
		this.nazwisko=nazwisko;
	}
	
	
	@Override
	public void printInfo() {
			System.out.println(rodzaj + " " +gatunek+" "+imie+" "+nazwisko);
			
		}
	@Override
	public void info() {
		System.out.println(rodzina);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanTest ht1 = new HumanTest("kamil", "O");
		ht1.info();
		ht1.printInfo();
		
		
		
		
	}

}
