
public class Gerente extends Funcionario implements Gerencia{
	
	private int nivel;
	
	public Gerente(int nivel, int matricula, Double salario, String nome, String funcao){
		super(matricula, salario, nome, funcao);
		this.nivel = nivel;
	}
	
	public void setNivel(int nivel){
		this.nivel = nivel;
	}
	
	public int getNivel(){
		return nivel;
	}
	
	@Override
	public Double calculaGratificacao(){
		return (salario * 0.25) * nivel;
	}
	
	@Override 
	public Double getSalario(){
		return calculaGratificacao() * 0.92;
	}
	
	@Override
	public String getFuncao(){
		return "Gerente";
	}
}


