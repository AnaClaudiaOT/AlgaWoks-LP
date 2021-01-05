package Capitulo03;

import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1. à vista / 2. à prazo: ]");
		Integer tipoPgto = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPgto.equals(1);
		
		Double juros = 0.0;
		
		if(pagamentoAVista) {
			juros = 0.0;
		}else {
			juros = 10.0;
		}
		
//		if(pagamentoAVista) {
//			
//		}else {
//			juros = 10.0;
//		}
//		
//		if(!pagamentoAVista) {
//			juros = 0.0;
//		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
				
		
		
		scanner.close();
	}

}
