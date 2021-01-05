package Encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Ana Claudia";
//		cliente.telefone = "1199999-9999";
//		
//		System.out.println("Nome cliente: " + cliente.nome);

		Cliente cliente = new Cliente();

		cliente.setNome("Ana Claudia");
		cliente.setTelefone("1199999-9999");

		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Último nome: " + cliente.getUltimoNome());

	}

}
