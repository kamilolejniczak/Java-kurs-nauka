package wyjatki;

public class J89 {

	public static void testString(String s){
		try{
			System.out.println(s.length());
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Nie mo�na poda� d�ugo�ci dla ci�gu mapisu - zosta� przekazany null");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testString("test");
		testString(null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
