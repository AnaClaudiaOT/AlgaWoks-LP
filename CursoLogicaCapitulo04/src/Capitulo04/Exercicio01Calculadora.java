package Capitulo04;

import java.util.Scanner;

public class Exercicio01Calculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("*** CALCULADORA **** ]");

		System.out.print("Digite o primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite qual será a operação [1. soma / 2. subtração / 3. multiplicação / 4. divisão: ]");
		Integer operacao = scanner.nextInt();

		System.out.print("Digite o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();

		Double resultado = null;

		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		if (operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		if (operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}

		System.out.println("O resultado da operação é: " + resultado);

		scanner.close();

	}

}
