import java.util.Scanner;
public class Empresa {
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		Empresa e = new Empresa();
		while(true){
			switch(e.menu()){
				case 0 : System.exit(0);
				case 1 : Vendedor vendedor = e.setVendedor();
						 System.out.println("Nome: "+vendedor.getNome());
						 System.out.println("Comissão: R$"+vendedor.calculaComissao()+" | Salário: R$"+ vendedor.getSalario());
						 break;
				case 2 : Gerente gerente = e.setGerente();
						 System.out.println("Nome: "+gerente.getNome());
						 System.out.println("Comissão: R$"+gerente.calculaGratificacao()+" | Salário: R$"+ gerente.getSalario());
						 break;
				
			}
		}
	}
	
	private int menu(){
		System.out.println("1 Vendedor");
		System.out.println("2 Gerente");
		
		return sc.nextInt();
	} 
	
	private Vendedor setVendedor(){
		sc.nextLine();
		System.out.printf("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Matricula: ");
		int matricula = sc.nextInt();
		System.out.printf("Salario: ");
		Double salario = sc.nextDouble();
		System.out.printf("Total de Vendas em R$: ");
		Double vendas = sc.nextDouble();
		Vendedor v = new Vendedor(vendas, matricula, salario, nome, "Vendedor");
		return v;
	}

	private Gerente setGerente(){
		sc.nextLine();
		System.out.printf("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Matricula: ");
		int matricula = sc.nextInt();
		System.out.printf("Salario: ");
		Double salario = sc.nextDouble();
		System.out.printf("Nível: ");
		int nivel = sc.nextInt();
		Gerente g = new Gerente(nivel, matricula, salario, nome, "Vendedor");
		return g;
	}
}

