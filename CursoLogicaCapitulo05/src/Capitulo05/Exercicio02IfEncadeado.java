package Capitulo05;

import java.util.Scanner;

public class Exercicio02IfEncadeado {

	
	public static void main(String[] args) {
		//Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.
		//Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou. Depois, receba o parâmetro referente ao faturamento
		//real da empresa no ultimo ano. Por último, receba a média salarial do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, 
		//já que estamos trabalhando com um algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).
		//Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários ganharam um bônus que será igual a 
		//média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.
		//No final, mostre de quanto será o prêmio desse funcionário(a).
		//
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digita o valor da meta para esse ano: ");
		Double meta = scanner.nextDouble();
		
		System.out.println("Qual foi o faturamento do ano? ");
		Double faturamento = scanner.nextDouble();
		
		System.out.println("Qual foi a média salarial dos funcionários nos últimos 12 meses?");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorcentoMeta = (meta * 80) / 100;
		
		Boolean faturamentoBateuMeta = faturamento >= meta;
		
		Boolean faturouPeloAoMenosOitentaPorcento = faturamento >= oitentaPorcentoMeta;
		
		if(faturamentoBateuMeta) {
			System.out.println("Parabéns, a empresa bateu a meta e você receberá um bônus de: " + mediaSalarial);
		}else if(faturouPeloAoMenosOitentaPorcento){
			System.out.println("Parabéns, você vai ganhar um bônus de 80%! No valor de: " + (mediaSalarial * 80) / 100);
		}else {
			System.out.println("Infelizmente, esse ano não haverá bônus");
			
		}
		
		
	}
	
}
