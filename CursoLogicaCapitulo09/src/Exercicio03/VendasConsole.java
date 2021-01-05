package Exercicio03;

public class VendasConsole {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.codigo = "5789";
		pedido.subTotal = 700.00;
		pedido.desconto = 100.00;
		
		System.out.println("O código do produto é: " + pedido.getCodigo());
		System.out.println("O subtotal ficou no valor de R$ : " + pedido.getSubTotal());
		System.out.println("O desconto foi de de R$ " + pedido.getDesconto());
		System.out.println("O total foi de R$ " + pedido.getTotal());
	}

}
