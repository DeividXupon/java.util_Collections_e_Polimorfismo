package br.com.alura.testes;

import br.com.alura.obj.Aluno;
import br.com.alura.obj.Aula;
import br.com.alura.obj.Cursos;

public class TestaCusosComAlunos {

	public static void main(String[] args) {

		Cursos algoritimos = new Cursos("Algoritimos", "Gustavo");
		algoritimos.addAula(new Aula("Logica de Progração", 10));
		algoritimos.addAula(new Aula("Logica de Programação 2", 20));
		algoritimos.addAula(new Aula("Operadores Logicos", 30));
		
		Aluno aluno1 = new Aluno("Deivid", 93827);
		Aluno aluno2 = new Aluno("Gomes", 42637);
		Aluno aluno3 = new Aluno("Wilhan", 86782);
		
		algoritimos.matricula(aluno1);
		algoritimos.matricula(aluno2);
		algoritimos.matricula(aluno3);
		algoritimos.matricula(new Aluno("Xupon", 666));
		
		System.out.println(algoritimos.getAluno());
		System.out.println();
		algoritimos.getAluno().forEach(a -> System.out.println(a));
		
		Aluno alu = new Aluno("Pepino", 666);
		System.out.println(algoritimos.existeAqui(alu));
		
		System.out.println(algoritimos.especficar(93827));

	}

}
