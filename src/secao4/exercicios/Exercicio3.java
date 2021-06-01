package secao4.exercicios;

import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

public class Exercicio3 {
	static public void main(String[] args) {
		int A;
		int B;
		int C;
		int D;
		
	Scanner ex3 = new Scanner (System.in);
	System.out.println("Digite o valor de A");
	A = ex3.nextInt();
	System.out.println("Digite o valor de B");
	B = ex3.nextInt();
	System.out.println("Digite o valor de C");
	C = ex3.nextInt();
	System.out.println("Digite o valor de D");
	D = ex3.nextInt();
	
	double diferenca = (A*B)-(C*D);
	System.out.println("DIFERENÇA = " + diferenca);
	
	
	ex3.close();
		

	}
}
