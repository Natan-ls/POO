public class Dvd extends Produto {
	
	private String genero;
	private int duracao;
	
	public Dvd(int id, String nome, String descricao, Double preco, String genero, int duracao){
		super(id, nome, descricao, preco);
		this.genero = genero;
		this.duracao = duracao;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setDuracao(int duracao){
		this.duracao = duracao;
	}
	
	public int getDuracao(){
		return duracao;
	}
	
}

