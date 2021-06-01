package secao5;

import java.util.Scanner;

/*
 *  Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 * ENTRADA 				SAIDA
 * 	12					PAR
 * 	-27					IMPAR
 * 	0					PAR
 */
public class Exercicio2Secao5 {
	public static void main(String[] args) {
		int numeroInteiro;
		
		System.out.println("Digite um número");
		Scanner scan = new Scanner(System.in);
		numeroInteiro = scan.nextInt();
		
		if (numeroInteiro % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}

}
