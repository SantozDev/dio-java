package mediaAritmetica;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor digite a primeira nota: ");
		double notaUm = scanner.nextDouble();
		
		System.out.println("Por favor digite a Segunda nota: ");
		double notaDois = scanner.nextDouble();
		
		MediaAritmetica media = new MediaAritmetica(notaUm, notaDois);
		System.out.println("A media de " + notaUm + " e " + notaDois + " é " + media.calcularMedia());

		
		scanner.close();
	}
	
}
