import java.util.Scanner;
public class Contas {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		Pessoa pessoa = new Pessoa();
		while(true){
			System.out.println("1- Cadastro");
			System.out.println("2- Sacar");
			System.out.println("3- Deposito");
			System.out.println("4- Informações");
			System.out.println("Opção: ");
			int opc = sc.nextInt();
			switch(opc){
				case 1: System.out.println("Nome: ");
						sc.nextLine();
						pessoa.setNome(sc.nextLine());
						System.out.println("Cpf: ");
						pessoa.setCpf(sc.nextLine());
						System.out.println("Endereço: ");
						pessoa.setEndereco(sc.nextLine());
						System.out.println("Telefone: ");
						pessoa.setTelefone(sc.nextLine());
						System.out.println("Renda: ");
						pessoa.setRenda(sc.nextDouble());
						conta.setPessoa(pessoa);
						conta.setSaldo(0.0);
						break;
				
				case 2: System.out.println("Valor do saque: ");
						Double saque = sc.nextDouble();
						if(!conta.sacar(saque))
							System.out.println("Não foi possível realizar o saque!");
						else System.out.println("Saque realizado!");
						break;
						
				case 3: System.out.println("Valor do deposito: ");
						Double deposito = sc.nextDouble();
						if(!conta.depositar(deposito))
							System.out.println("Não foi possível realizar o deposito!");
						else System.out.println("Deposito realizado!");
						break;
				
				case 4: pessoa = conta.getPessoa();
						System.out.println(pessoa.informacoes());
						break;
				case 0: System.exit(0);
			}	
		}
	}
}

