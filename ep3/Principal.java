import java.util.ArrayList;
import java.util.Collections;


public class Principal{
	public static void main(String[] args){
		Alunos aux = new Alunos();
		ArrayList<Alunos>aluno = new ArrayList<Alunos>();
		for(int i=0 ;i < 5;i++){
			aux = new Alunos();
			aux.setIdade(i);
			aux.setNome("Rodrigo");
			aluno.add(aux);
		}
		
		Collections.sort(aluno);
			
		for(int i = 0;i<5;i++){	
			System.out.println("Nome: " + aluno.get(i).getNome() + "Idade: " + aluno.get(i).getIdade());
		}
	}
}