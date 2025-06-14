public class Cachorro extends Mamifero {
    private Double altura;
	
	public Cachorro(String nome, Double peso, int idade, int velocidade, Double altura){
		super(idade, velocidade, peso, nome, 2);
		this.altura = altura;
	}
    
    public void setAltura(Double altura){
		this.altura = altura;
	}
	
	public Double getAltura(){
		return altura;
	}
	
}
