package Dziedziczenie;			//J68

public class Punkt2D {

	int x, y;
	

	public Punkt2D() {
	}
	public void print(){
		System.out.println(" "+x+" "+y);
	}


	public Punkt2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void polozenie(int a, int b) {
		this.x=x+a;
		this.y=y+b;
	}
	

}
