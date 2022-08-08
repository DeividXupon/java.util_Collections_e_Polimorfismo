package br.com.alura.obj;

public class Aula {

	private String titulo;
	private double tempo;
	
	
	public Aula(String titulo, double tempo)
	{
		this.tempo = tempo;
		this.titulo = titulo;
	}
	
	public String getTitulo() 
	{
		return titulo;
	}
	
	public double getTempo() 
	{
		return tempo;
	}
	
	@Override
	public String toString() 
	{
		return "Aula: "+this.titulo+" |Tempo: "+this.tempo;
	}
	
	
	
}
