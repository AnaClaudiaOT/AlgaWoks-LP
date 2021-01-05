package Capitulo03;

public class TipoLogico {
	
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa: " + variavelFalsa);
		
		System.out.println("------------------------------------");
		
		Integer idade = 15;
		
		Boolean podeTirarCnh = idade >= 18;
		
		System.out.println("Pode tirar a CNH? " + podeTirarCnh);
		
		System.out.println("------------------------------------");
		
		Integer age = 20;
		
		Boolean podeTirarCarteira = age >= 18;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Pode tirar a carteira");
		}else{
			System.out.println("Não pode tirar a carteira, menor de idade!");
		}
	}

}
