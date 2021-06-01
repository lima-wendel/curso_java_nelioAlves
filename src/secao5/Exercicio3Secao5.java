package secao5;

import java.util.Scanner;

/*
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

Entrada: 					Saída:
6 24 						Sao Multiplos

6 25 						Nao sao Multiplos

24 6 						Sao Multiplos


 */
public class Exercicio3Secao5 {
	public static void main(String[] args) {
		int A;
		int B;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		scan.close();
	}

}
