public class Revista extends Produto{
	
	private String data;
	private int numero;
	
	public Revista(int id, String nome, String descricao, Double preco, String data, int numero){
		super(id, nome, descricao, preco);
		this.data = data;
		this.numero = numero;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public String getData(){
		return data;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getNumero(){
		return numero;
	}
		
}

