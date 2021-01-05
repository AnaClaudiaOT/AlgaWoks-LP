package Capitulo02;
import java.util.Scanner;

public class ExercicioCalcularImc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		
		System.out.print("Digite o seu peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double IMC = peso / alturaAoQuadrado;
		
		System.out.println("O seu IMC é: " + IMC);
		
		scanner.close();
	}
}
