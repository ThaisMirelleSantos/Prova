package prova;


public class Livro extends Publicacao {
	private int numeroPag;
	private String editora;
	
    public void Livro (String titulo, int numeroPag, String editora) {
    	super.setAnoPublicacao(numeroPag);
    	super.setAutor(editora);
    	super.setTitulo(titulo);
    	
    	this.numeroPag = numeroPag;
    	this.editora = editora;
    }
  
	
	public int getNumeroPag() {
		return numeroPag;
	}
	public void setNumeroPag(int numeroPag) {
		this.numeroPag =numeroPag ;
	}
	
	
	public String getEditora() {
		return editora;
	}
	public void setTitulo(String editora) {
		this.editora = editora;
	}
		@Override
		public String exibirDetalhes() {
			return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado em: " + super.getAnoPublicacao() + " Com: "+ this.numeroPag + " Paginas e da Editora: "+ this.editora;
		}
		
		public String exibirDetalhes(boolean edit) {
			if(edit) {
				return	"O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado em: " + super.getAnoPublicacao() + " Com: "+ this.numeroPag + " Paginas e a Editora é: " + this.editora;
			}else {
				return 	"O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado em: " + super.getAnoPublicacao() + " Com: "+ this.numeroPag + " Paginas";
			
			}
		}


		public void setEditora(String next) {
			// TODO Auto-generated method stub
			
		}


}
	
	
	

