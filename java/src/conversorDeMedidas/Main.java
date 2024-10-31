package conversorDeMedidas;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite um valor em metros para converter em Centrimetros: ");
		double valorMetro = scanner.nextDouble();

		ConversorDeMedidas conversor = new ConversorDeMedidas(valorMetro);
		System.out.println(valorMetro + " M em Centímetros é " + conversor.converterParaCentimetros() + " CM");
		
		
	}

}
