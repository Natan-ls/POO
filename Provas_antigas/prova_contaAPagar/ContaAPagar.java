public class ContaAPagar {
	
	private int codigo;
	private String descricao;
	private int diaDeVencimento;
	private Double valor;
	private boolean status;
	
	public ContaAPagar(int codigo, int diaDeVencimento, Double valor){
		this.codigo = codigo;
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
		descricao = "Não informado";
		status = false;
	}
	
	public ContaAPagar(int codigo, String descricao, int diaDeVencimento, Double valor){
		this.codigo = codigo;
		this.descricao = descricao;		
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
		status = false;	
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDiaDeVencimento(int diaDeVencimento){
		this.diaDeVencimento = diaDeVencimento;
	}
	
	public int getDiaDeVencimento(){
		return diaDeVencimento;
	}
	
	public void setValor(Double valor){
		this.valor = valor;
	}
	
	public Double getValor(){
		return valor;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public boolean getStatus(){
		return status;
	}
	
	public String pagar(int dia){
		if(status)
			return "A conta já está paga!";
		
		Double multa = 0.0;
		if(dia > diaDeVencimento)
			multa = valor * 0.1;
	
		status = true;
		return "Descrição: "+descricao+
				"\nValor Pago: "+(valor + multa)+
				"\nMulta: "+multa;
	}
	
	public String pagar(int dia, Double desconto){
		if(status)
			return "A conta já está paga!";
		
		String retorno = "Conta paga";
		if(dia > diaDeVencimento)
			retorno +=	"! Pagamento em atraso, valor da multa R$ "+(valor*0.1)+
						". Valor do pagamento R$ "+(valor*1.1)+".";
		else
			retorno	+=	"! Valor do desconto R$ "+desconto+
						". Valor do pagamento R$ "+(valor - desconto)+".";
		status = true; 
		return retorno;
	}
		
	public String exibir(){
		String retorno = "Descrição: "+ descricao+
						 "\nDia do Vencimento: "+ diaDeVencimento+
						 "\nValor: R$ "+ valor;
		if(status)
			retorno += "\nPago!";
		else
			retorno += "\nÁ pagar!";
		return retorno;
	}
	
}

