import java.util.ArrayList;
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
		while(!aluno.isEmpty()){
    	        System.out.println(aluno);
		}	
		
	}
}
