public class Aluno {
	
	private String nome;
	private int matricula;
	private int[] notas = new int[4];
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	public void setNotas(int[] notas){
		this.notas = notas;
	}
	
	public int[] getNotas(){
		return notas;
	}
	
	public String exibeNotas(){
		String retorno = "";
		Double media = 0.0;
		for(int x=0; x<notas.length; x++){
			retorno+= String.format("N%d = %.1f - ", x+1, (float)notas[x]);
			media+=notas[x];
		}
		return String.format(retorno+"Média: %.1f", media/notas.length);
	}
	
	public String exibeSituacao(){
		int media = 0;
		for(int x:notas)
			media+=x;
		return nome+((media/notas.length)>=6 ? " Aprovado":" Reprovado");
	}
	
}

