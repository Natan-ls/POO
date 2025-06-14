public class Cd extends Produto {
	
	private String artista;
	private int faixas;
	
	public Cd(int id, String nome, String descricao, Double preco, String artista, int faixas){
		super(id, nome, descricao, preco);
		this.artista = artista;
		this.faixas = faixas;
	}
		
	public void setArtista(String artista){
		this.artista = artista;
	}
	
	public String getArtista(){
		return artista;
	}
		
	public void setFaicas(int faixas){
		this.faixas = faixas;
	}
	
	public int getFaixas(){
		return faixas;
	}
	
}

