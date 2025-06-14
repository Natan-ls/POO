public class ContaComum extends ContaBancaria {
	
	public ContaComum(int numero, Pessoa cliente, int senha){
		super(numero, cliente, senha);
	}
	
	@Override
	public String sacar(int senha, Double valor){
		if(senha == this.senha){
			if(valor*1.01 <= saldo){				
				saldo -= valor;
				return String.format("SAQUE NO VALOR DE R$ %.2f REALIZADO COM SUCESSO, TARIFA R$ %.2f", valor, valor * 0.01);
			}
			return "SALDO INSUFICIENTE";
		}
		return "SENHA INCORRETA";
	}
}

