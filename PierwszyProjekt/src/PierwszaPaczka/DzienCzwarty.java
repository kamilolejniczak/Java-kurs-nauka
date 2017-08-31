package PierwszaPaczka;

import java.util.Random;

public class DzienCzwarty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//tablice
		
		/*int[][] tab = new int[3][3];
		tab[0][0] = 1;
		tab[0][1] = 2;
		
		int[][] tab2 = { {1,2,3,5,6}, {4,5,6,5,6}, {7,8,9,5,6} };
		System.out.println(tab2[0][0]);
		System.out.println(tab2[0][1]);
		System.out.println(tab2[1][0]);
		
		String[][][] tab3 = { {{"a1","a2"},{"a3","a4"}},{{"b1","b2"},{"b3","b4"}}};
		System.out.println(tab3[1][0][1]);
		
		for(int i = 0; i<=tab2.length-1; i++) {
			for(int j=0; j<=tab2[1].length-1; j++) {
				System.out.print(tab2[i][j]);
			}
			System.out.println("");
		}	
		System.out.println(tab2.length); //d³ugoœæ pierwszego wymiaru
		System.out.println(tab2[1].length); //d³ugoœæ drugiego wymiaru
*/		
		
		//tablica w tablicy
		
		/*String[] firstNames = {"Karol", "Basia", "Kasia"};
		String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstNames, lastNames};
		
		for(int i=0; i<=firstNames.length -1; i++) {
			
				System.out.print(firstLast[0][i]);
				System.out.print(" ");
				System.out.print(firstLast[1][i]);
			
			System.out.println("");
	}*/
		
		//J43
		
		/*Random los = new Random();
		
		int[] tablica = new int[10];
		for(int i=0; i<tablica.length; i++) {
			tablica[i] = los.nextInt(21)-10;
		}
		for(int i=0; i<=tablica.length-1; i++) {
			System.out.println(tablica[i]);
		}
		System.out.println("wypisanie odwrotne");
		for(int i = tablica.length -1; i>=0; i--) {
		System.out.println("tablica[i]");
		}
		int max = tablica[0];
		int min = tablica[0];
		for(int i = 0; i<=tablica.length-1; i++) {
			if(max < tablica[i]) {
				max = tablica[i];
			}
			if(min > tablica[i]) {
				min = tablica[i];
			}
		}
		System.out.println("najmniejsza " + min + "\n" + " najwieksza " + max);
		
		int sum = 0;
		for(int i = 0; i<=tablica.length-1; i++) {
			sum += tablica[i];
		}
		System.out.println("suma " + sum);
		
		float srednia = sum/tablica.length;
		System.out.println("srednia " + srednia);
		//max i min
		int mniejsze = 0;
		int wieksze = 0;
		for(int i = 0; i<=tablica.length-1; i++) {
			if(tablica[i]>srednia) {
				wieksze ++;
				
			}
			if(tablica[i]<srednia) {
				mniejsze++;
				}
		}
		System.out.println("wieksze od sredniej " + wieksze);
		System.out.println("mniejsze od sredniej " + mniejsze);	*/
		
		
		//J44
		
		/*Random los = new Random();
		
		int[] tablica = new int[20];
		
		for(int i = 0; i<tablica.length; i++) {
			tablica[i] = los.nextInt(10)+1;
			
		}
		
		for(int i : tablica) {
			System.out.println(i+ " ");
		}
		System.out.println("");
		for(int i = 1; i<11; i++) {
			int counter = 0;
			for(int j=0; j<tablica.length; j++) {
				if(tablica[j] == i) {
					counter++;
				}
			}
		if(counter > 0) {
			System.out.println(i + " powtarza siê w tablicy " + counter + " razy");
		}
		
		}*/
		
		
		//J45													
	/*	int[][] tabl = new int[5][5];
		//generowanie
		Random generator = new Random();
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				tabl[i][j] = generator.nextInt(11)-5;
			}
		}
		//wypisywanie
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				System.out.print(tabl[i][j]+"\t");
			}
			System.out.println("");
		}
		//liczymy minima i maksima
		int tempMin = tabl[0][0];
		int tempMax = tabl[0][0];
		int[][] maxMin = new int[2][5];
		for(int j = 0; j<tabl.length; j++){
			for(int i = 0; i<tabl[j].length; i++){
			//System.out.print(tabl[i][j]);
			if(tempMin>tabl[i][j]){
				tempMin = tabl[i][j];
			}
			if(tempMax<tabl[i][j]){
				tempMax = tabl[i][j];
				}
			}
			maxMin[0][j] = tempMax;
			maxMin[1][j] = tempMin;
			tempMax = 0;
			tempMin = 0;										// PRZEANALIZOWAÆ!!! POWTÓRZYÆ!!! ROZKMINIÆ!!!
		}
		//Wypisywanie
		System.out.println("");
		for(int i = 0; i<maxMin.length; i++){
			for(int j = 0; j<maxMin[i].length; j++){
				System.out.print(maxMin[i][j]+"\t");
			}
			System.out.println("");
		}*/

		
			
		//J47
		
		/*int[][] tab1 = {{1,0,0}, {0,1,0}, {0,0,1}};		
		int[][] tab2 = {{1,0,0}, {0,1,0}, {0,0,1}};
		int[][] tab3 = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<tab1.length; j++) {
				tab3[i][j] = tab1[i][j]+tab2[i][j];
				System.out.print("\t" + tab3[i][j]);
			}
			System.out.println("");
		}*/
		
		//J48
		
		/*int[][] MultiMno = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				MultiMno[i][j] = (i+1)*(j+1);
				System.out.print(MultiMno[i][j] + "\t ");
			}
			System.out.println("");
		}*/
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
