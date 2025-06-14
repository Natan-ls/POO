public class ContaBancaria {
	
	protected int numero;
	protected int senha;
	protected Pessoa cliente;
	protected Double saldo;
	
	public ContaBancaria(int numero, Pessoa cliente, int senha){
		this.numero = numero;
		this.senha = senha;
		this.cliente = cliente;
		saldo = 0.0;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getNumero(){
		return numero;
	}
		
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public int getSenha(){
		return senha;
	}
	
	public void setCliente(Pessoa cliente){
		this.cliente = cliente;
	}
	
	public Pessoa getCliente(){
		return cliente;
	}
	
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	public Double getSaldo(){
		return saldo;
	}
	
	public String sacar(int senha, Double valor){
		if(senha == this.senha){
			if(valor <= saldo){
				saldo -= valor;
				return String.format("SAQUE NO VALOR DE R$ %.2f REALIZADO COM SUCESSO", saldo);
			}
			return "SALDO INSUFICIENTE";
		}
		return "SENHA INCORRETA";
	}
	
	public String depositar(Double valor){
		saldo += valor;
		return String.format("DEPOSITO NO VALOR DE R$ %.2f REALIZADO COM SUCESSO", valor);
	}

	public String consultaSaldo(int senha){
		if(senha == this.senha)
			return String.format("SALDO: R$ %.2f", saldo);
		return "SENHA INCORRETA";
	}

}

