public class Normal extends Ingresso {
	
	private boolean pista;
	
	@Override
	public Double mostraValor(){
		if(pista){
			return valor * 1.1;
		}
		return valor;
	}
	
	public Normal(Double valor, boolean pista){
		super(valor);
		this.pista = pista;
	}
	
	public void setPista(boolean pista){
		this.pista = pista;
	}
	
	public boolean getPista(){
		return pista;
	}
	
}


