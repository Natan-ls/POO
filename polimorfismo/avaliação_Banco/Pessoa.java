public class Pessoa{
	
	private String nome;
	private String cpf;
	private Double renda;
	
	public Pessoa(String nome, String cpf, Double renda){
		this.nome = nome; 
		this.cpf = cpf;
		this.renda = renda;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setRenda(Double renda){
		this.renda = renda;
	}
	
	public Double getRenda(){
		return renda;
	}	
}

