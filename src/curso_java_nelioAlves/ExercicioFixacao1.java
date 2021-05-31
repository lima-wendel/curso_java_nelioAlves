package curso_java_nelioAlves;

import java.util.Locale;

public class ExercicioFixacao1 {
	
	public static void main (String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products: \n" + product1 + ", wich price is $ 2100,00");
		System.out.println(product2 + ", which price is $ 650,00 \n");
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.8f", measure);
		System.out.println();
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}
