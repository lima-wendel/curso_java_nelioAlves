package entradaDeDados;

import java.util.Scanner;

/*
 * Devemos criar um objeto do tipo Scanner
 * Scanner sc = new Scanner(Sytem.in);
 * import java.util.Scanner;
 * sc.close() quando não precisar mais do objeto sc
 * 
 */



public class EntradaDeDados {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sua idade: ");
		int idade;
		idade = sc.nextInt();									//nextDouble(); char: sc.next().charAt(0)
		
		
		System.out.println(nome + idade + " anos de idade");
		
		sc.close();
	}

}

/*
 * String x;
 * int y;
 * double z;
 * 
 * x = sc.next();
 * y = sc.nextInt();
 * z = sc.nextDouble();
 * 
 * */
