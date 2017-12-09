package Model.Questão6Extra;

public class Funcionario {
    private double salário;

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public double getBonificação(){
        return this.salário * 0.10;
    }
}
