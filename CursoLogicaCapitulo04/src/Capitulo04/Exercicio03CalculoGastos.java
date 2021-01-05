package Capitulo04;

import java.util.Scanner;

public class Exercicio03CalculoGastos {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com os valores gastos com: ");
		
		Double total = 0.0;
		
		System.out.print("Conta de luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de água: ");
		total += scanner.nextDouble();
		
		System.out.print("Conta de telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Escola do filho: ");
		total += scanner.nextDouble();
		
		System.out.print("Fatura do cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Gastos com supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O valor total das contas é de: " + total);
		
		scanner.close();
	}

}
