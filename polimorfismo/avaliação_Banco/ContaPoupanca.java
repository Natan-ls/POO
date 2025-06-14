public class ContaPoupanca extends ContaBancaria{
	
	private int dataBase;
	
	public ContaPoupanca(int dataBase, int numero, Pessoa cliente, int senha){
		super(numero, cliente, senha);
		this.dataBase = dataBase;
	}

	public void setDataBase(int dataBase){
		this.dataBase = dataBase;
	}
	
	public int getDataBase(){
		return dataBase;
	}

	public Double calculaRendimento(int dia, int rendimento){
		if(dia > dataBase){
			saldo *= rendimento;
			return saldo;
		}
		return 0.0;
	}

}

