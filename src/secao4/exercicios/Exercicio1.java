package secao4.exercicios;

import java.util.Scanner;

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

Exemplos:
Entrada						Saída
10							SOMA = 40
30

-30							SOMA = -20
10

0							SOMA = 0
0

*/

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner soma = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1;
		numero1 = soma.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2;
		numero2 = soma.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("SOMA = " + resultado);
		
	}

}
