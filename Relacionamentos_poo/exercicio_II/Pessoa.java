public class Pessoa {
	
	private String nome;
	private String sexo;
	private Data nascimento;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public void setNascimento(Data nascimento){
		this.nascimento = nascimento;
	}
	
	public Data getNascimento(){
		return nascimento;
	}	
	
	public Pessoa(String nome){
		this.nome = nome;
		nascimento = new Data();
	}
	
	public Pessoa(String nome, String sexo, Data nascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	
	public String mostraIdade(Data hoje){
		return nascimento.calculaTempo(hoje);
	}
	
}

