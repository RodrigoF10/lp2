import java.util.ArrayList;
import java.util.Collections;


public class Principal{
	public static void main(String[] args){
		ArrayList<Nota>notas = new ArrayList<Nota>();
		Alunos a1 = new Alunos();
		a1.setNome("Rodrigo");
		a1.setIdade(17);
		Alunos a2 = new Alunos();
		a2.setNome("Matheus");
		a2.setIdade(20);
		Alunos a3 = new Alunos();
		a3.setNome("Elias");
		a3.setIdade(16);
		Alunos a4 = new Alunos();
		a4.setNome("Gabriel");
		a4.setIdade(19);
		Alunos a5 = new Alunos();
		a5.setNome("Marcos");
		a5.setIdade(18);
		
		Disciplina lp2 = new Disciplina();
		lp2.setNome("lp2");
		lp2.setProfessor("Herbert");
		
		Disciplina web = new Disciplina();
		web.setNome("web");
		web.setProfessor("Marcelo");
		
		Nota n1 = new Nota();
		n1.setValor(5,a1,lp2);
		notas.add(n1);
		Nota n2 = new Nota();
		n2.setValor(8,a1,web);
		notas.add(n2);		
		Nota n3 = new Nota();
		n3.setValor(7,a2,lp2);
		notas.add(n3);		
		Nota n4 = new Nota();
		n4.setValor(9,a2,web);
		notas.add(n4);		
		Nota n5 = new Nota();
		n5.setValor(4,a3,lp2);
		notas.add(n5);		
		Nota n6 = new Nota();
		n6.setValor(3,a3,web);
		notas.add(n6);		
		Nota n7 = new Nota();
		n7.setValor(8,a4,lp2);
		notas.add(n7);		
		Nota n8 = new Nota();
		n8.setValor(7,a4,web);
		notas.add(n8);	
		Nota n9 = new Nota();
		n9.setValor(2,a5,lp2);
		notas.add(n9);
		Nota n10 = new Nota();
		n10.setValor(10,a5,web);
		notas.add(n10);
		
		Collections.sort(notas);
		
 				int i = 0;
            System.out.println("Maior nota: " + notas.get(i).getValor());
            System.out.println("Matéria: " + notas.get(i).getDisciplina().getNome() + "\nProfessor: " + notas.get(i).getDisciplina().getProfessor() + "\nAluno: " + notas.get(i).getAlunos().getNome());
            
            i = 0;
            System.out.println("\nMaior nota de lp2: ");
            while(i < 4){
            	if(notas.get(i).getDisciplina().getNome() != lp2.getNome()){
            	        i++;
            	}
            	else{
						System.out.println("Aluno: " + notas.get(i).getAlunos().getNome() + "\nNota: " + notas.get(i).getValor());
						i=4;            
            	}
            }
	}
}
