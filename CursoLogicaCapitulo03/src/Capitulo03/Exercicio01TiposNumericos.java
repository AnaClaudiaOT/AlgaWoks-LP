package Capitulo03;
import java.util.Scanner;

public class Exercicio01TiposNumericos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculando o quadrado de um número ");
		
		System.out.print("Digite o número: ");
		Double numeroComum = scanner.nextDouble();

		Double quadrado = numeroComum * numeroComum;

		System.out.println("O quadrado de: " + numeroComum + " é: " + quadrado);

		scanner.close();
	}
}
