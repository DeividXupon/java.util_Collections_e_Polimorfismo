package br.com.alura.obj;

public class Aluno {
	
	private String nome;
	private int codigoDoAluno;
	
	public Aluno(String nome, int codigoDoAluno) {
		if(nome == null) {
			throw new NullPointerException("Valores não atribuidos");
		}
		this.nome = nome;
		this.codigoDoAluno = codigoDoAluno;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoDoAluno() {
		return codigoDoAluno;
	}
	
	@Override
	public String toString() {
		return "Aluno: "+this.nome+" | N "+this.codigoDoAluno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	

}
