import java.util.Scanner;
public class SetorPessoal {
	
	private Funcionario[] funcionarios;
	
	public void setFuncionario(Funcionario[] funcionarios){
		this.funcionarios = funcionarios;
	}
	
	public SetorPessoal(){
		Scanner sc = new Scanner(System.in);
		int quantidadeFuncionario = 0;
		System.out.println("Informe a quantidade de funcionários!");
		while(true){
			quantidadeFuncionario = sc.nextInt();
			if(quantidadeFuncionario>0)
				break;
			System.out.println("Número inválido!");
		}
		funcionarios = new Funcionario[quantidadeFuncionario];
	}
	
	public boolean adicionarFuncionario(Funcionario funcionario){
		int indiceLivre = -1;
		for(int x=0; x<funcionarios.length; x++){
			if(funcionarios[x] != null){
				//Verificando se há número de matriculas repetidos
				if(funcionarios[x].getMatricula() == funcionario.getMatricula()){
					System.out.println("Número de matricula repetido, tente outro numero!");
					return false;
				}
				//Verificando se há nomes repetidos
				if(funcionarios[x].getNome().equals(funcionario.getNome())){
					System.out.println("Nome do funcionário repetido, tente outro nome!");
					return false;
				}
			}
			else{
				if(indiceLivre == -1)
					indiceLivre = x;
			}
		}
		if(indiceLivre != -1){
			funcionarios[indiceLivre] = funcionario;
			System.out.println("Funcionário adicioado!");
			return true;
		}
		System.out.println("Falha ao adicionar funcionário!");
		return false;
	}
	
	public boolean removerFuncionario(Funcionario funcionario){
		for(int x=0; x<funcionarios.length; x++){
			if(funcionarios[x] != null){
				if(funcionarios[x] == funcionario){
					funcionarios[x] = null;
					System.out.println("Funcionário removido!");
					return true;
				}
			}
		}
		System.out.println("Funcionario não foi removido!");
		return false;
	}
	
	public Funcionario buscarFuncionario(int matricula){
		for(int x=0; x<funcionarios.length; x++){
			if(funcionarios[x] != null){
				if(funcionarios[x].getMatricula() == matricula)
					return funcionarios[x];
			}
		}
		return null;
	}
	
	public Funcionario buscarFuncionario(String nome){
		for(int x=0; x<funcionarios.length; x++){
			if(funcionarios[x] != null){
				if(funcionarios[x].getNome().equals(nome))
					return funcionarios[x];
			}
		}
		return null;
	}
	
	public Funcionario[] listarFuncionarios(int departamento){
		Funcionario[] funcionariosFiltro = new Funcionario[funcionarios.length];
		int y = 0;
		for(int x=0; x<funcionarios.length; x++){
			if(funcionarios[x] != null){
				if(funcionarios[x].getDepartamento() == departamento){
					funcionariosFiltro[y] = funcionarios[x];
					y++;
				}
			}
		}
		
		return funcionariosFiltro;
	}

	public Funcionario[] listarFuncionarios(String funcao){
		Funcionario[] funcionariosFiltro = new Funcionario[funcionarios.length];
		int y = 0;
		for(int x=0; x<funcionarios.length; x++){
			if(funcionarios[x] != null){
				if(funcao.equals(funcionarios[x].getFuncao())){
					funcionariosFiltro[y] = funcionarios[x];
					y++;
				}
			}
		}
		
		return funcionariosFiltro;
	}
	
	public Funcionario[] listarFuncionarios(){
		return funcionarios;
	}
	
}

