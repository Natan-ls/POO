import java.util.Scanner;
public class Empresa {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		SetorPessoal setor = new SetorPessoal();
		while(true){
			System.out.println("1 - Adicionar funcionario");
			System.out.println("2 - Remover funcionario");
			System.out.println("3 - Dados funcionario");
			System.out.println("4 - Listar funcionario");
			System.out.println("5 - Folha de pagamento");
			switch(sc.nextInt()){
				case 1: Funcionario funcionario = new Funcionario();
						sc.nextLine();
						System.out.printf("Nome: ");
						funcionario.setNome(sc.nextLine());
						System.out.printf("Matricula: ");
						funcionario.setMatricula(sc.nextInt());
						System.out.printf("Departamento: ");
						funcionario.setDepartamento(sc.nextInt());
						System.out.printf("Salario: ");
						funcionario.setSalario(sc.nextDouble());
						System.out.printf("Função: ");
						sc.nextLine();
						funcionario.setFuncao(sc.nextLine());
						setor.adicionarFuncionario(funcionario);
						break;
				case 2: System.out.println("Remover funcionario");
						System.out.println("1 - Por matricula");
						System.out.println("2 - Por nome");
						switch(sc.nextInt()){
							case 1: System.out.printf("Matricula: ");
									setor.removerFuncionario(setor.buscarFuncionario(sc.nextInt()));
									break;
							case 2: System.out.printf("Nome: ");
									sc.nextInt();
									setor.removerFuncionario(setor.buscarFuncionario(sc.nextLine()));
									break;
						}
						break;
				case 3: System.out.println("Buscar funcionario");
						System.out.println("1 - Por matricula");
						System.out.println("2 - Por nome");
						switch(sc.nextInt()){
							case 1: System.out.printf("Matricula: ");
									funcionario = setor.buscarFuncionario(sc.nextInt());
									System.out.println(funcionario.getNome()+" "+funcionario.getSalario());
									break;
							case 2: System.out.printf("Nome: ");
									sc.nextLine();
									funcionario = setor.buscarFuncionario(sc.nextLine());
									System.out.println(funcionario.getNome()+" "+funcionario.getSalario());
									break;
						}
						break;
				case 4:	System.out.println("Listar funcionarios");
						System.out.println("1 - Por Departamento");
						System.out.println("2 - Por função");
						System.out.println("3 - Todos");
						switch(sc.nextInt()){
							case 1: System.out.printf("Departamento: ");
									Funcionario []func = setor.listarFuncionarios(sc.nextInt());
									if(func != null){
										for(Funcionario x:func){
											if(x != null)
												System.out.println(x.getNome()+" "+x.getSalario());
										}
									}
									break;
							case 2: System.out.printf("Função: ");
									sc.nextLine();
									func = setor.listarFuncionarios(sc.nextLine());
									if(func != null){
										for(Funcionario x:func){
											if(x != null)	
												System.out.println(x.getNome()+" "+x.getSalario());
										}
									}
									break;
							case 3: func = setor.listarFuncionarios();
									if(func != null){
										for(Funcionario x:func){
											if(x != null)
												System.out.println(x.getNome()+" "+x.getSalario());
										}
									}
									break;
						}
						break;
				case 5: System.out.println("Calcular a folha de funcionarios");
						System.out.println("1 - Por Departamento");
						System.out.println("2 - Todos");
						Funcionario []func;
						switch(sc.nextInt()){
							case 1: System.out.printf("Departamento");
									func = setor.listarFuncionarios(sc.nextInt());	
									if(func != null){
										Double salario = 0.0;
										for(Funcionario x:func){
											if(x != null)
												salario += x.getSalario();
										}
										System.out.println("Valor da folha de pagamento: R$ "+salario);
									}
									break;							
							case 2: func = setor.listarFuncionarios();
									if(func != null){
										Double salario = 0.0;
										for(Funcionario x:func){
											if(x != null)
												salario += x.getSalario();
										}
										System.out.println("Valor da folha de pagamento: R$ "+salario);
									}
									break;
						}
						break;
				}
		}
	}
}

