public class Disciplina {
	
	private int codigo;
	private String nome;
	private Aluno[] alunos = new Aluno[10];
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setAlunos(Aluno[] alunos){
		this.alunos = alunos;
	}
	
	public Aluno[] getAlunos(){
		return alunos;
	}
	
	public void listaAlunos(){
		for(Aluno aluno:alunos){
			if(aluno!=null)
				System.out.println("Nome: "+aluno.getNome()+" Matricula: "+aluno.getMatricula());
		}
	}

	public void exibeNotaAluno(int matricula){
		for(Aluno aluno:alunos){
			if(aluno != null){
				if(aluno.getMatricula() == matricula){
					System.out.println(aluno.exibeNotas());
					return;
				}
			}
		}
		System.out.println("Aluno não encontrado!");
	}
	
	public void exibeStatus(int matricula){
		for(Aluno aluno:alunos){
			if(aluno != null){
				if(aluno.getMatricula() == matricula){
					System.out.println(aluno.exibeSituacao());
					return;
				}
			}
		}
		System.out.println("Aluno não encontrado!");
	}

	public void adicionarAluno(Aluno aluno){
		for(int x=0; x<alunos.length; x++){
			if(alunos[x] == null){
				alunos[x] = aluno;
				return;
			}
		}
	}

}

