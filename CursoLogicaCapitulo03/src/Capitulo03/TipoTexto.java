package Capitulo03;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		
		System.out.print("Qual o seu nome? ");
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
					
		System.out.println("Olá " + nome + "!");
		
		scanner.close();
	}

}
