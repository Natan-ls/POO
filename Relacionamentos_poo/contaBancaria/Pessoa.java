public class Pessoa{
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Double renda;
	
	public String informacoes(){
		return "Nome: "+nome+"\tCpf: "+cpf+"\nEndereço: "+endereco+"\nTelefone: "+telefone+"\tRenda: "+renda;
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

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco(){
		return endereco;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}

	public void setRenda(Double renda){
		this.renda = renda;
	}
	
	public Double getRenda(){
		return renda;
	}
}

