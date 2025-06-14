public class Financeiro {
	
	public static void main (String[] args) {
		ContaAPagar conta = new ContaAPagar(1, 12, 35.0);
		System.out.println(conta.pagar(13));
		System.out.println(conta.exibir());
	}
}

