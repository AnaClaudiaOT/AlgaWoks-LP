package Capitulo04;

import java.util.Scanner;

public class Exercicio04Aposentadoria {
	
	static final Integer IDADE_MINIMA_PARA_SE_APOSENTAR = 55;
	
	static final Integer TEMPO_DE_CONTRIBUICAO = 25;
	
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.println("Digite o tempo de contribuição: ");
		Integer anosContribuicao = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_SE_APOSENTAR;
		
		Boolean temTempoContribuicao = anosContribuicao >= TEMPO_DE_CONTRIBUICAO;
		
		Boolean podeAposentar = temIdadeParaAposentar && temTempoContribuicao;
		
		if(podeAposentar) {
			System.out.println("Sua aposentadoria está liberada!");
		}else {
			System.out.println("Ainda não pode se aposentar!");
		}
		
		scanner.close();
	}

}
