public class Funcionario {
    protected int matricula;
    protected String nome;
    protected Double salario;

    public Funcionario(int matricula, String nome, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public Double calculaSalario(){
        Double salarioFinal = this.salario - (this.salario * 0.11);
        return salarioFinal;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
