package Capitulo05;

public class EstruturaIf {
	
	public static void main(String[] args) {
		
		// Opções de If
		//Primeira
//		Boolean movimentaPeloMenosMetadeDoValor= true;
//		Boolean aContaTemTempoSuficienteDeAbertura = true;
//		Boolean temNomeLimpo = true;
//		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
//				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
//		
//		if(!liberarEmprestimo) {
//			System.out.println("O empréstimo está disponível.");
//		}else {
//			System.out.println("O empréstimo não está disponível.");
//		}
		
		//Segunda
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.00;
		
		Boolean movimentaPeloMenosMetadeDoValor= (movimentacaoMedia * 2) >= emprestimo; // a movimentação média tem que ser pelo ao menos 2x maior que o valor solicitado para emprestimo
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		if(((movimentacaoMedia*2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura
		&& temNomeLimpo){
			System.out.println("O empréstimo está disponível.");
		}else {
			System.out.println("O empréstimo não está disponível.");
		}
	}

}
