
public abstract class Pessoa {
	
	protected String nome;
	protected String funcao;
	
	public Pessoa(String nome, String funcao){
		this.nome = nome;
		this.funcao = funcao;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	
	public String getFuncao(){
		return "Pessoa Física";
	}
}

