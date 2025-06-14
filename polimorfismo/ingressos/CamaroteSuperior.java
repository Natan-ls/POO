public class CamaroteSuperior extends Vip {
	
	private char classe;
	
	public CamaroteSuperior(Double valor, Double adicional, char classe){
		super(valor, adicional);
		this.classe = classe;
	}
	
	public void setClasse(char classe){
		this.classe = classe;
	}
	
	public char getClasse(){
		return classe;
	}
	
	@Override
	public Double mostraValor(){
		Double preco = valor + getAdicional();
		if(classe == 'B' || classe == 'b')
			preco *= 1.5;
		if(classe == 'A' || classe == 'a')
			preco *= 1.75;
		return preco;
	}
	
}

