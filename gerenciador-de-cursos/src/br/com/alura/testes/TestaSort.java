package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.obj.Aula;

public class TestaSort {

	public static void main(String[] args) {

		Aula a1= new Aula("PHP", 10);
		Aula a2 = new Aula("C++", 15.28);
		Aula a3 = new Aula("Java", 20.25);
		
		List<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//(VarQueRepresentaCadaElementoDaLista, um elemento a frente do VQRCEDL) -> *comparador*
		//aulas.sort((aula, outraAula) -> aula.getTitulo().compareTo(outraAula.getTitulo()));
		//
		
		//compara pelo titulo
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		for (Aula aula : aulas) 
		{
			System.out.println(aula.toString());
		}
		
		System.out.println("-----------------------------");
		
		//compara pelo tempo
		aulas.sort(Comparator.comparing(Aula::getTempo));
		aulas.forEach(aula -> System.out.println(aula.toString()));
		
	}

}
