public class Livro extends Produto {
	
	private String autor;
	private int isbn;
	
	public Livro(int id, String nome, String descricao, Double preco, String autor, int isbn){
		super(id, nome, descricao, preco);
		this.autor = autor;
		this.isbn = isbn;
	}
		
	public void setAutos(String autor){
		this.autor = autor;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setIsbn(int isbn){
		this.isbn = isbn;
	}
	
	public int getIsbn(){
		return isbn;
	}
	
}

