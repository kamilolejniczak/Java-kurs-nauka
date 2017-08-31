package wyjatki;

import java.util.Random;

public class J90 {

	private class MyException1 extends Exception {}
	private class MyException2 extends Exception {}
	
	public void losuj() throws MyException1, MyException2, MyExceptions{
		Random r = new Random();
		switch(r.nextInt(3)){
		case 0:
			throw new MyException1();
		case 1:
			throw new MyException2();
		case 2:
			throw new MyExceptions();
		}	
	} 
	
	public static void main(String[] args) {
		J90 test1 = new J90();
		try{
			test1.losuj();
		} catch (MyException1 e){
			System.out.println("Z�apano wyj�tek klasy " + e.getClass());
		} catch (MyException2 e){
			System.out.println("Z�apano wyj�tek klasy " + e.getClass());
		} catch (MyExceptions e){
			System.out.println("Z�apano wyj�tek klasy " + e.getClass());
		}

		
		
		
	}

}
