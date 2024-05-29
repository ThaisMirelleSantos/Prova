package prova;



public class Publicacao {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String exibirDetalhes() {
		return "O nome Do Publicação é: " + this.titulo + " Do autor: " + this.autor + " Publicado em: " + this.anoPublicacao;
}
}
