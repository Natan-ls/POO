public class Professor extends Funcionario {
    private int numeroAulas;

    public Professor(int numeroAulas, int matricula, String nome, Double salario) {
        super(matricula, nome, salario);
        this.numeroAulas = numeroAulas;
    }

    @Override
    public Double calculaSalario() {
        return (salario * numeroAulas) * 0.89;

    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }
}
