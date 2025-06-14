public class Vip extends Ingresso {
	
	protected Double adicional;
	
	public Vip(Double valor, Double adicional){
		super(valor);
		this.adicional = adicional;
	}
	
	public void setAdicional(Double adicional){
		this.adicional = adicional;
	}
	
	public Double getAdicional(){
		return adicional;
	}
	
	@Override
	public Double mostraValor(){
		return valor + adicional;
	}
	
}

