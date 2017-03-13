public class Alunos implements Comparable<Alunos>{
	private String nome;
	private int idade;	

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getNome(){
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	public int compareTo(Alunos outro){
		if(this.idade < outro.getIdade())
			return -1;
		else if(this.idade > outro.getIdade())
			return 1;
		else
			return 0;
	}
}	
