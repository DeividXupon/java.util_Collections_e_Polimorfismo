package br.com.alura.testes;

import br.com.alura.obj.Aula;
import br.com.alura.obj.Cursos;

public class TestaCursos {

	public static void main(String[] args) {

		Cursos javaCurso = new Cursos("Java", "Nico");
		
		javaCurso.addAula(new Aula("java JDK", 50));
		javaCurso.addAula(new Aula("java OO", 20));
		javaCurso.addAula(new Aula("java Polimorfismo", 60));
		
		System.out.println(javaCurso.getAulas());
		System.out.println("----------------------------------");
		System.out.println(javaCurso.getAulas().get(0));
	
	}

}
