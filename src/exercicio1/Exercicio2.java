package exercicio1;

import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159.

Entrada: 					Saída:
2.00 						A=12.5664
100.64 						A=31819.3103
150.00 						A=70685.7750


 */
public class Exercicio2 {
	public static void main(String[] args) {
		double pi = 3.1459;
		double raio;
		double area;
		
		System.out.println("Digite a área do círculo: ");
		Scanner scan = new Scanner(System.in);
		raio = scan.nextDouble();

		
		scan.close();
		area = pi * Math.pow(raio, 2);
		System.out.printf("A= %.4f", area);

	}

}
