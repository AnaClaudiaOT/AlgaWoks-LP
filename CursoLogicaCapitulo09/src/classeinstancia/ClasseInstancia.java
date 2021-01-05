package classeinstancia;

public class ClasseInstancia {
	
	public static void main(String[] args) {
		
		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto1 = new Produto();
		produto1.nome = "Caneca";
		
//		Produto.quantidadeMinimaEstoque = 11;
//		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque)
		
		Produto produto2 = new Produto();
		produto2.nome = "Copo";
		
		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);
		
//		System.out.println("Produto 1: " + produto1.nome);
//		
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto1.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);
		
	}

}
