package Questao5;

public class Diretor extends Funcionario {

    private double salario;

    public double getSalario() {
        return salario;
    }

    @Override
    public double getBonificação() {
        return getSalario() + (getSalario()*0.2);
    }
}
