public class Produto {
	
	protected int id;
	protected String nome;
	protected String descricao;
	protected Double preco;
	
	public Produto(int id, String nome, String descricao, Double preco){
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDecricao(){
		return "Id: "+id+"\nNome: "+nome+"\nDescrição: "+descricao+"\nPreço: "+preco;
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
	
	public Double getPreco(){
		return preco;
	}
	
}

