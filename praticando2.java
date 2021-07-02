package introduçãojava;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias*/
public class praticando2 {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		float dias,anos,meses,totaldias;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nQual é o seu total de dias?");
		totaldias= leia.nextFloat();
		
		        anos=totaldias/365;
				meses=(totaldias%365)/30;
				dias=(totaldias%365)%30;
				
				
				System.out.println(" Você viveu:"+anos+"anos"+meses+"meses"+dias+"dias");
				
		
	}

}
