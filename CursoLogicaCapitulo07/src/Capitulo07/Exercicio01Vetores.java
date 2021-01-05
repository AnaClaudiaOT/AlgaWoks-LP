package Capitulo07;

import java.util.Scanner;

public class Exercicio01Vetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tarefas = new String[5];

		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Tarefa " + i + ":");
			tarefas[i] = scanner.nextLine();
		}

		System.out.println("Suas tarefas do dia são: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ":" + tarefas[i]);

		}
		
		scanner.close();

	}
}
