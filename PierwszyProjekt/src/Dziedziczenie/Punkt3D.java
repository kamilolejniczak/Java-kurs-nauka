package Dziedziczenie;			//J68

public class Punkt3D extends Punkt2D {

	int z;

	public Punkt3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public void polozenie(int a, int b, int c) {
		super.polozenie(a, b);
		this.z=z+c;
	}

	public Punkt3D(){}
	
	public void print(){
		System.out.println(" "+x+" "+y+" "+z);
	}

	
	
	
}
