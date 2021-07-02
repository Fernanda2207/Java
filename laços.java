package introduçãojava;

import java.util.Scanner;

// 1 Faça um Programa que receba três inteiros e diga qual deles é o maior

public class laços {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o Primeiro numero"); 
		n1=leia.nextInt();
		System.out.println("\n Entre com o Segundo numero");
		n2=leia.nextInt();
		System.out.println("\n Entre com o Terceiro numero");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.printf("\no maior numero é o Primeiro" ,n1+n2+n3);
		}
		
		else if(n2>n1 && n2>n3) {
			System.out.printf("\no maior numero é o Segundo" ,n2+n1+n3);
			
		}
		
		else {
			System.out.printf("o maior numero é o terceiro");
			
		}
		
		
	}
}
		
	   


