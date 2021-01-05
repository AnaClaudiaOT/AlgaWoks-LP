package Capitulo03;

import java.util.Scanner;

public class Exercicio05Constante {

	static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual seu nome? ");
		String nome = scanner.nextLine();
		
		System.out.print("Qual foi sua nota? ");
		Integer nota = scanner.nextInt();
		
		Boolean passouDeAno = nota >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;
		
		if(passouDeAno) {
			System.out.println("Parabéns, " + nome + " você passou!");
		}else {
			System.out.println(nome + ", infelizmente você está de recuperação.");
		}
		
		scanner.close();
	}

}
