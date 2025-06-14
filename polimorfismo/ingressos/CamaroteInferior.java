public class CamaroteInferior extends Vip {
	
	private String localizacao;
	
	public CamaroteInferior(Double valor, Double adicional, String localizacao){
		super(valor, adicional);
		this.localizacao = localizacao;
	} 
	
	public void setLocalicao(String localizacao){
		this.localizacao = localizacao;
	}
	
	public String getLocalizacao(){
		return localizacao;
	}
	
	@Override
	public Double mostraValor(){
		Double preco = valor + getAdicional();
		if(localizacao.equals("lateral"))
			preco *= 1.2;
		if(localizacao.equals("frontal"))
			preco *= 1.35;
		return preco;
	}
	
}

