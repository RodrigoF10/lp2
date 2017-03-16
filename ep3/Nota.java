public class Nota implements Comparable<Nota>{
	private double valor;
	private Alunos aluno;
	private Disciplina disciplina;
	
	public void setValor(double valor, Alunos aluno, Disciplina disciplina){
		this.valor = valor;
		this.aluno = aluno;
		this.disciplina = disciplina;
	} 
	public double getValor(){
		return this.valor;	
	}
	
	public Alunos getAlunos(){
		return this.aluno;	
	}
	
	public Disciplina getDisciplina(){
		return this.disciplina;	
	}
	
	public int compareTo(Nota outro){
		if(this.valor < outro.getValor())
			return 1;
		else if(this.valor > outro.getValor())
			return -1;
		else
			return 0;
	}
}
