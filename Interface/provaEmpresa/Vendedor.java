
public class Vendedor extends Funcionario implements Comissao {
	
	private Double totalDeVendas;
	
	public Vendedor(Double totalDeVendas, int matricula, Double salario, String nome, String funcao){
		super(matricula, salario, nome, funcao);
		this.totalDeVendas = totalDeVendas;
	}
	
	public void setTotalDeVendas(Double totalDeVendas){
		this.totalDeVendas = totalDeVendas;
	} 
	
	public Double getTotalDeVendas(){
		return totalDeVendas;
	}
	
	@Override
	public Double calculaComissao(){
		return totalDeVendas * 2.5;
	}
	
	@Override 
	public Double getSalario(){
		return ((totalDeVendas * 2.5) + salario) * 0.92;
	}
	
	@Override
	public String getFuncao(){
		return "Vendedor";
	}
	
}

