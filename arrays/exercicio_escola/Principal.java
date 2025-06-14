import java.util.*;
public class Principal {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Disciplina disc = new Disciplina();
		
		while(true){
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Listar alunos");
			System.out.println("3 - Status aluno");
			System.out.println("4 - Notas do aluno");
			System.out.println("0 - Sair");
			int opc = sc.nextInt();
			switch(opc){
				case 0: System.exit(0);
				case 1: Aluno aluno = new Aluno();
						System.out.println("Nome do aluno: ");
						sc.nextLine();
						aluno.setNome(sc.nextLine());
						System.out.println("Matricula Aluno: ");
						aluno.setMatricula(sc.nextInt());
						int[] notas = new int[4];
						for(int x=0; x<4; x++){
							System.out.println("Nota da prova "+(x+1));
							notas[x] = sc.nextInt();
						}
						aluno.setNotas(notas);
						disc.adicionarAluno(aluno);
						break;
				
				case 2: disc.listaAlunos();
						break;
				
				case 3: System.out.println("Informe o nº de matricula do aluno:");
						disc.exibeStatus(sc.nextInt());
						break;
				case 4: System.out.println("Informe o nª de matricula do aluno:");
						disc.exibeNotaAluno(sc.nextInt());
						break;
				default: System.out.println("Opção inválida!");
			}
		}
	}
}

