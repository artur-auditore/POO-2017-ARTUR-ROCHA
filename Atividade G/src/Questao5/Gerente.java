package Questao5;

public class Gerente extends Funcionario {

    private double salario;
    private double partLucros;

    public double getSalario() {
        return salario;
    }

    public double getPartLucros() {
        return partLucros;
    }

    @Override
    public double getBonificação() {
        return getSalario() + (getSalario()*0.5) + getPartLucros();
    }
}
