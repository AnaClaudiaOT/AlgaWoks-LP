package Capitulo03;

import java.util.Scanner;

public class Exercicio03Logico {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual seu nome? ");
		String nome = scanner.nextLine();
		
		System.out.print("Qual foi sua nota? ");
		Integer nota = scanner.nextInt();
		
		Boolean passou = nota >= 70;
		
		if(passou) {
			System.out.println("Parabéns, " + nome + " você passou!");
		}else {
			System.out.println(nome + ", infelizmente você foi reprovado(a).");
		}
		
		scanner.close();
	}

}
