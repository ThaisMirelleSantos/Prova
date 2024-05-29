package prova;



	public class Revista extends Publicacao {
		private int numEdicao;
		private String mesPublicacao;
		
		public void Revista(String titulo, String autor, int anoPublicacao, int numEditora, String mesPublicacao) {
			super.setAnoPublicacao(anoPublicacao);
			super.setAutor(autor);
			super.setTitulo(titulo);
			this.numEdicao = numEditora;
			this.mesPublicacao = mesPublicacao;
			}
		


	public int getNumEdicao() {
		return numEdicao;
	}
	public void setNumEdicao(int NumEdicao) {
		this.numEdicao = numEdicao;
		}
	public String getMesPublicacao() {
		return mesPublicacao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao =mesPublicacao;
	}
	@Override
	public String exibirDetalhes() {
		return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado no Ano de:  " + super.getAnoPublicacao()+ " Que é a "+this.numEdicao+"° Publicada em: "+this.mesPublicacao;
	}
	public String exibirDetalhes(boolean mes) {
		if(mes) {
			return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado no Ano de:  " + super.getAnoPublicacao()+ " Que é a "+this.numEdicao+"° Publicada em: "+this.mesPublicacao;
		}else {
			return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado no Ano de: " + super.getAnoPublicacao()+ " Que é a "+this.numEdicao+"°";
		}
	}

}
