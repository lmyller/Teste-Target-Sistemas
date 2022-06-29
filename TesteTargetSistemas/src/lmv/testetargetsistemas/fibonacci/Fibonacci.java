package lmv.testetargetsistemas.fibonacci;

import java.io.InputStream;
import java.util.Scanner;

public class Fibonacci {
	
	private static final String NUMERO_INTEIRO_POSITIVO = "Número inteiro e positivo: ";
	
	public static void main(String[] args) {
		fibonacci();
	}

	public static void fibonacci() {
		int fibonacci = 1, anterior = 0, numero;
		Scanner scanner = criarScanner(System.in);
		
		System.out.println(NUMERO_INTEIRO_POSITIVO);
		
		numero = lerNumeroInteiro(scanner);
		System.out.println();
		
		for(int indice = 0; indice < numero; indice++) {
			System.out.println(fibonacci);
			fibonacci += anterior;
			anterior = fibonacci - anterior;
		}
		scanner.close();
	}

	private static int lerNumeroInteiro(Scanner scanner) {
		return scanner.nextInt();
	}

	private static Scanner criarScanner(InputStream inputStream) {
			return new Scanner(inputStream);
	}
}
