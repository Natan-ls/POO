public class Administrativo extends Funcionario{
    private int jornada;

    public Administrativo(int jornada, int matricula, String nome, Double salario) {
        super(matricula, nome, salario);
        this.jornada = jornada;
    }

    @Override
    public Double calculaSalario() {
        Double salarioFinal = 0.0;

        if (jornada == 30) {
            salarioFinal = this.salario + (this.salario * 0.10);

        }else{
            salarioFinal = this.salario + (this.salario * 0.25);
        }

        return salarioFinal * 0.89;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }
}
