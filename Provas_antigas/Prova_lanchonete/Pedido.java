public class Pedido {
	
	private int codigo;
	private String cliente;
	private Double valor;
	
	public Pedido(int codigo){
		this.codigo = codigo;
		cliente = "Não informado";
		valor = 0.0;
	}
	
	public Pedido(int codigo, String cliente){
		this.codigo = codigo;
		this.cliente = cliente;
		valor = 0.0;
	}

	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getCliente(){
		return cliente;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public Double getValor(){
		return valor;
	}
	
	public void setValor(Double valor){
		this.valor = valor;
	}
	
	public String adiciona(int produto){
		if(produto == 1)
			valor += 20.0;
		else if(produto == 2)
			valor += 12.0;
		else 
			valor += 15.0;
		String frase =  "Pedido "+codigo+" - Cliente: "+cliente+" - Total: R$ "+valor;
		return frase;
	}
	
	public String adiciona(int produto, Double batata){
		if(produto == 1)
			valor += 20.0;
		else if( produto == 2)
			valor += 12.0;
		else 
			valor += 15.0;
		valor += (batata * 1.05);
		String frase = "Pedido "+codigo+" - Cliente: "+cliente+" - Total: R$ "+valor;
		return frase;
	}
	
	public String adiciona(int produto, Double batata, Double refrigerante){
		if(produto == 1)
			valor += 20.0;
		else if( produto == 2)
			valor += 12.0;
		else 
			valor += 15.0;
		valor += (batata * 1.05) + (refrigerante * 1.02);
		String frase = "Pedido "+codigo+" - Cliente: "+cliente+" - Total: R$ "+valor;
		return frase;
	}	
	
	public String adiciona(int produto, Double batata, int cookie){
		if(produto == 1)
			valor += 20.0;
		else if( produto == 2)
			valor += 12.0;
		else 
			valor += 15.0;
		valor += (batata * 1.05) + (cookie * 2);
		String frase = "Pedido "+codigo+" - Cliente: "+cliente+" - Total: R$ "+valor;
		return frase;
	}
}

