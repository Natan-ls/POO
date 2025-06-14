
public class Funcionario extends Pessoa {
	
	protected int matricula;
	protected Double salario;
	
	public Funcionario(int matricula, Double salario, String nome, String funcao){
		super(nome, funcao);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	public void setSalario(Double salario){
		this.salario = salario;
	}
	
	public Double getSalario(){
		return salario * 0.92;
	}
	
	@Override
	public String getFuncao(){
		return "Funcionário";
	}
}


