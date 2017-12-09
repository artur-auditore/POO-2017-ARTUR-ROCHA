package Model.Questão7;

import Model.Questão6.Pessoa;

public class Funcionário extends Pessoa {
    private int matrícula;
    private double salário;

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public double setSalarioPrimeiraParcela(){
        return this.getSalário()*0.6;
    }

    public double setSalarioSegundaParcela(){
        return this.getSalário()*0.4;
    }
}