public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(){
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public int getDia(){
		return dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public int getMes(){
		return mes;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public int getAno(){
		return ano;
	}
	
	public String retornaData(){
		return dia+"/"+mes+"/"+ano;
	}
	
	public String calculaTempo(Data data){
		int dias = ((ano*365) + (mes*30) + dia) - ((data.getAno()*365) + (data.getMes()*30) + data.getDia());
		String frase = (dias/365)+" anos, ";
		frase+= ((dias/365)/12)+" meses, ";
		frase+= ((dias%365)%12)+" dias.";
		return frase;
	}
	
}

