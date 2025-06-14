public class ContaBancaria {
	private Pessoa cliente;
	private int numeroDaConta;
	private Double saldo;

	public void setPessoa(Pessoa cliente){
		this.cliente = cliente;
	}
	
	public Pessoa getPessoa(){
		return cliente;
	}
	
	public void setNumeroDaConta(int numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	
	public int getNumeroDaConta(){
		return numeroDaConta;
	}
	
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	public Double getSaldo(){
		return saldo;
	}
	
	public boolean sacar(Double saque){
		if((saque>0.0) && (saque<=saldo)){
			saldo -= saque;
			return true;
		}
		return false;
	}
	
	public boolean depositar(Double deposito){
		if(deposito>0.0){
			saldo+= deposito;
			return true;
		}
		return false;
	}
}

