package introdu��ojava;

import java.util.Scanner;

// 1 Fa�a um Programa que receba tr�s inteiros e diga qual deles � o maior

public class la�os {

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
			System.out.printf("\no maior numero � o Primeiro" ,n1+n2+n3);
		}
		
		else if(n2>n1 && n2>n3) {
			System.out.printf("\no maior numero � o Segundo" ,n2+n1+n3);
			
		}
		
		else {
			System.out.printf("o maior numero � o terceiro");
			
		}
		
		
	}
}
		
	   


