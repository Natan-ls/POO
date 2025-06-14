public class Animal {
	protected String nome;
	protected Double peso;
	protected int tipo;
	
	public Animal(String nome, Double peso, int tipo){
		this.nome = nome;
		this.peso = peso;
		this.tipo = tipo;
	}
    
    public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
    
    public void setPeso(Double peso){
		this.peso = peso;
	}
	
	public Double getPeso(){
		return peso;
	}
    
    public void setTipo(int tipo){
		this.tipo = tipo;
	}
	
	public int getTipo(){
		return tipo;
	} 
}
