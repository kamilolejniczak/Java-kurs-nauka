package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {

	private double a;
	private double b;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}

	public double add(double a, double b){
		return a + b;
	}
	public double sub(double a, double b){
		return a - b;
	}
	public double multi(double a, double b){
		return a * b;
	}
	public double div(double a, double b){
		return a / b;
	}

	
}
