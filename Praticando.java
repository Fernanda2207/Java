package introdu��ojava;
//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.

import java.util.Scanner;

public class Praticando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		float totaldias,meses,dias,anos;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nQuantos anos voc� tem?:");
		anos= leia.nextFloat();
		System.out.println("\nQuantos meses voc� tem?:");
		meses= leia.nextFloat();
		System.out.println("\nQuantos dias voc� tem?:");
		dias= leia.nextFloat();
		
	
		totaldias=(dias+(anos*365)+(meses*30));
				
		
		System.out.println("\n SEU TOTAL DE DIAS VIVIDOS �:" +totaldias);
	}
	}


