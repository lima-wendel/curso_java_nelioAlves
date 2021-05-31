package exercicio1;

import java.util.Locale;
import java.util.Scanner;

/*

Fazer um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 

A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada: 									Saída:
25 											NUMBER = 25
100 										SALARY = U$ 550.00 
5.50

1 											NUMBER = 1
200 										SALARY = U$ 4100.00 
20.50

6 											NUMBER = 6
145 										SALARY = U$ 2254.75 
15.55
 */


public class Exercicio4 {
	public static void main(String[] args) {
		int numeroFuncionario;
		double horasTrabalhadas;
		double salarioHora;
		
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.println("Digite o seu número de funcionário:");
	numeroFuncionario = sc.nextInt();
	
	System.out.println("Digite o valor da hora trabalhada");
	salarioHora = sc.nextInt();
	
	System.out.println("Digite a quantidade de horas tabalhadas:");
	horasTrabalhadas = sc.nextDouble();
	
	sc.close();
	
	double salario = horasTrabalhadas * salarioHora; 
	
	System.out.println("NUMBER = " + numeroFuncionario);
	System.out.printf("SALARY = %.2f", salario);
	
	}
	

}
