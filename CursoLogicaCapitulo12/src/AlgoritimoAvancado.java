
public class AlgoritimoAvancado {

	public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Ana Claudia";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Lucas";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Eliane";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4= new Aluno();
		aluno4.nome = "Sonia";
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Airton";
		listaAlunos.adicionar(aluno5);
		
		iterar(listaAlunos);
		
		listaAlunos.ordenar();
		
		iterar(listaAlunos);
		
		listaAlunos.remover(aluno3);
		
		iterar(listaAlunos);
	}
	
	static void iterar(ListaAlunos listaAlunos) {
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}
		
		System.out.println("--------------------------");
	}

}
