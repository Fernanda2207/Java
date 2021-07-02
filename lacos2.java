package introduçãojava;
//Exercicio 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
//10-14 infantil 15-17 juvenil 18-25 adulto
import java.util.Scanner;

public class lacos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int anos;
 
 Scanner leia = new Scanner(System.in);
 
 System.out.println("\nSua Idade:");
 
	 anos = leia.nextInt();
	 
	 if(anos>=10 && anos<=14)
	 {
		 System.out.println("\nCAtegoria Infantil");
	 }
	 else if (anos>=15 && anos<=17)
	 {
		 System.out.println("\nCategoria Juvenil");
	 }
	 else if(anos>=18 && anos<=25)
	 {
		 System.out.println("\nCategoria Adulto");
	 }
	 else
	 {System.out.println("\n Nenhuma Categoria");
	 }
		 
	 }

}
