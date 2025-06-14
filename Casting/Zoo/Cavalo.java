public class Cavalo extends Mamifero {
      private String raca;
	
	public Cavalo(String nome, Double peso, int idade, int velocidade, String raca){
		super(idade, velocidade, peso, nome, 3);
		this.raca = raca;
	}
    
    public void setRaca(String raca){
		this.raca = raca;
	}
	
	public String getRaca(){
		return raca;
	}
}
