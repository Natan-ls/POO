public class Mamifero extends Animal {
	protected int idade;
	protected int velocidade;
	
	public Mamifero(int idade, int velocidade, Double peso, String nome, int tipo){
		super(nome, peso, tipo);
		this.idade = idade;
		this.velocidade = velocidade;
	}
    
    public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return idade;
	}
        
    public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}
	
	public int getVelocidade(){
		return velocidade;
	}
	
	public Double correr(){
		return velocidade * (100-idade) / 100.0;
	}
}
