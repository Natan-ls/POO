public class Funcionario {
	
	private int matricula;
	private String nome;
	private int departamento;
	private Double salario;
	private String funcao;
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return matricula;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDepartamento(int departamento){
		this.departamento = departamento;
	}
	
	public int getDepartamento(){
		return departamento;
	}	
	
	public void setSalario(Double salario){
		this.salario = salario;
	}
	
	public Double getSalario(){
		return salario;
	}
	
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	
	public String getFuncao(){
		return funcao;
	}
	
	
}

