package Model.Questão6Extra;

public class Gerente extends Funcionario {


    public double getBonificação(){
        return this.getSalário() * 0.15;
    }
}
