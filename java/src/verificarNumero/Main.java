package verificarNumero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para verificar se é par ou ímpar: ");
		
		if (scanner.hasNextInt()) {
			int numero = scanner.nextInt();
			VerificarNumero verificar = new VerificarNumero(numero);
			System.out.println(verificar.verificar());
		} else {
			System.out.println("Por favor insira um número inteiro válido.");
		}
		
		scanner.close();
	}

}
