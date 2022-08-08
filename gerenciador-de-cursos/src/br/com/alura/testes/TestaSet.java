package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaSet {

	public static void main(String[] args) {
		
		//Set´s não possuem ordem então não podemos pegar um elemento pela sua posição
		//apenas com sua igual dade
		
		//Saco de strings
		Set<String> nomes = new HashSet<>();
		nomes.add("Xupon");
		nomes.add("C");
		nomes.add("B");
		nomes.add("D");
		nomes.add("A");
		nomes.add("A");
		
		//Set´s n tem ordem
		System.out.println(nomes);
		
		//contem ("isso") nesse set?
		System.out.println(nomes.contains("Xup"));
		//contem ("isso") nesse set?
		System.out.println(nomes.contains("Xupon"));
		
		//para poder organizar seu set temos q mandalo a uma lista
		//           LEMBRA QUE O SET ENTRA AQUI(* \|/ *)
		List<String> organNomes = new ArrayList<>(nomes);
		
		Collections.sort(organNomes);
		Collections.reverse(organNomes);
		
		for (String string : organNomes) {
			System.out.println("Nome: " + string);
		}
		
		
	}

}
