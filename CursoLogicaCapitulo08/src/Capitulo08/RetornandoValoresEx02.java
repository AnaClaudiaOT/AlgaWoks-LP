package Capitulo08;

public class RetornandoValoresEx02 {
	
	public static void main(String[] args) {
		
		// regra de 3
		//50 --- 100%
		// x ---  20%
		//
		//50 * 20 = x * 100
		// 1000 = x * 100
		// 1000 / 100 = x
		
		// x = (50*20)/100
		//premissa equivale a 100%
		// proporcão de 20% do que deve-se encontrar	
	
		Double[] premissaInicial = new Double [] {50.0, 100.0};
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println("Resultado da minha regra de três: " + resultadoFinal);
	
	}
			
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao / premissa[1]);
		return resultado;
		
	}
		
		
	
	
}
