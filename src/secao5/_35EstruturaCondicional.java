package secao5;

import java.util.Scanner;

/*
 * Estrutura condicional: estrutura de controle que permite definir 
 * que um certo bloco de comandos somente será executado dependendo de uma condição.
 * 
 * Sintaxe simples:
 * if (condicao) {
 * 		comando 1
 * 		comando 2
 * }
 */
public class _35EstruturaCondicional {
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("Bom dia");
		
		if(x < 0) {
			System.out.println("Boa tarde");
		}
		
		
		System.out.println("Boa noite");
		
		
		//estrutura condicional composta
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		
		if (hora <= 12) {
			System.out.println("Bom dia");
		}else {
			System.out.println("Boa tarde");
		}
		sc.close();
		
		//encadeamento de estruturas condicionais (mais de duas possibilidades)
		
		Scanner sc2 = new Scanner(System.in);
		int hora2;
		System.out.println("Que horas são de novo?");
		hora2 = sc2.nextInt();
		
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}

}
