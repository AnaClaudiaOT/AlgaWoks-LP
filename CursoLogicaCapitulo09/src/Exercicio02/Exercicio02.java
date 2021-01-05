package Exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Notebook XZ10";
		produto.quantidadeEstoque = 8;

		System.out.println(
				"Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
	}

}
