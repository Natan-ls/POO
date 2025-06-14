public class ContaEspecial extends ContaComum {
	
	private Double limite;
	
	public ContaEspecial(Double limite, int numero, Pessoa cliente, int senha){
		super(numero, cliente, senha);
		this.limite = limite;
	}
	
	public void setLimite(Double limite){
		this.limite = limite;
	}
	
	public Double getLimite(){
		return limite;
	}
	
	@Override
	public String sacar(int senha, Double valor){
		if(senha == this.senha){
			if(saldo + limite == 0.0)
				return "SALDO INSUFICIENTE";
			if(valor <= limite){
				Double tarifa = valor * 0.01;
				if((saldo-valor) < 0)
					tarifa = valor * 0.02;
				saldo -= valor;
				return String.format("SAQUE NO VALOR DE R$ %.2f REALIZADO COM SUCESSO, TARIFA R$ %.2f", valor, tarifa);
			}
			return "SALDO INSUFICIENTE";
		}
		return "SENHA INCORRETA";
	}
}

