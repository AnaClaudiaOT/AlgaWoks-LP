package Exercicio03;

public class Pedido {

	String codigo;

	Double subTotal;

	Double desconto;

	Double total;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return subTotal - desconto;
	}

	public void setTotal(Double total) {
		
	}

}
