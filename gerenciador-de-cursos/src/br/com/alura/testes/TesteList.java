package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {

		String aula1 = "Logica da Programação";
		String aula3 = "Git GitHub";
		String aula2 = "Java Orientado a Objetos";
		
		List<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		System.out.println();
		
		aulas.remove(0);
		
		aulas.forEach(aula -> System.out.println("| Aula:" +aula.toString()));
		System.out.println();
		
		System.out.println(aulas.get(0));
		System.out.println();
		
		aulas.add("B");
		aulas.add("C");
		aulas.add("A");
		
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println("| Aula:" +aula.toString()));
		
		

	}

}
