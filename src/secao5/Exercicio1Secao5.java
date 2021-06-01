package secao5;

import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 
 Entrada: 				Saída:
-10 					NEGATIVO
8 						NAO NEGATIVO
0 						NAO NEGATIVO
 
 */


public class Exercicio1Secao5 {
	public static void main(String[] args) {
	
	int numero;
	System.out.println("Digite um núemro");
	Scanner sc = new Scanner(System.in);
	numero = sc.nextInt();
	
	if (numero < 0) {
		System.out.println("NEGATIVO");
		} else {
		System.out.println("NAO NEGATIVO");
	}
	
	}
}
