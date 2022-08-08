package br.com.alura.obj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cursos {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> aluno = new HashSet<>();
	private Map<Integer, Aluno> mapAluno = new HashMap<>();
	
	public Cursos(String nomeCurso, String instrutor) {
		this.nome = nomeCurso;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public Set<Aluno> getAluno(){
		return Collections.unmodifiableSet(this.aluno);
	}
	
	public void addAula(Aula aula) {
		this.aulas.add(aula);
	}

	public void matricula(Aluno aluno) {
		this.aluno.add(aluno);
		this.mapAluno.put(aluno.getCodigoDoAluno(), aluno);
	}

	public boolean existeAqui(Aluno aluno) {
		return this.aluno.contains(aluno);
	}

	public Aluno especficar(int numero) {
		return this.mapAluno.get(numero);
	}
	
	
}
