package entradaDeDados;

import java.util.Scanner;

//ler um texto até a quebra de linha
public class EntradaDeDados2 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String s1, s2, s3;
	
	System.out.println("DIGITE OS DADOS");
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	System.out.println("DADOS DIGITADOS");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	}
}

//QUEBRA DE LINHA PENDENTE
/* Quando se usa um comando de leitura do nextLIne() e dá uma quebra de linha...
  essa quebra de linha fica pendente na entrada padrão
  Se o próximo comando for um nextLine(), essa quebra de linha será absorvida... 
  gerando uma linha vazia
   
  Solução: incluir um nextLine antes da entreda requerida
  
  	int x;
  	String s1, s2, s3; 
   
  	x = sc.nextInt(); 
  	sc.nextLine();
  	s1 = sc.nextLine();
  	s2 = sc.nextLine();
  	s3 = sc.nextLine();
	
	
	System.out.println("DADOS DIGITADOS");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3); 
 *  
 *  
 *  
 */