package Capitulo03;

import java.util.Scanner;

public class Exercicio02TipoTexto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? ");		
		String nome = scanner.nextLine();
		
		System.out.print("Qual o seu sobrenome? ");		
		String sobreNome = scanner.nextLine();
		
									
		System.out.println("Olá, " + nome + " "+ sobreNome + "!");
		
		scanner.close();
	}

}
