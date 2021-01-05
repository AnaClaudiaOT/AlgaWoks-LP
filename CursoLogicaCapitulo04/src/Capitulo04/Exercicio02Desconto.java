package Capitulo04;

import java.util.Scanner;

public class Exercicio02Desconto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do produto: ");
		Double valorDoProduto = scanner.nextDouble();

		Boolean precisaCobrarFrete = valorDoProduto < 100;

		Double valorFinal = valorDoProduto;

		if (precisaCobrarFrete) {
			valorFinal += 15.0;
		}

		System.out.println("Valor final: " + valorFinal);

		scanner.close();
	}

}
