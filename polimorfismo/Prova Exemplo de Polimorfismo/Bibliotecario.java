public class Bibliotecario extends Funcionario{
    private int turnos;

    public Bibliotecario(int turnos, int matricula, String nome, Double salario) {
        super(matricula, nome, salario);
        this.turnos = turnos;
    }

    @Override
    public Double calculaSalario() {
        Double salarioFinal = 0.0;

        if (this.turnos > 1) {
            salarioFinal = this.salario + (this.salario * 0.4);
        }
        if (this.turnos == 1) {
            salarioFinal = this.salario + (this.salario * 0.15);
        }

        return salarioFinal * 0.89; //return super.calculaSalario();
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    } 
}
