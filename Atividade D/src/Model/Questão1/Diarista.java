package Model.Questão1;

import Model.Questão1.Empregado;

public class Diarista extends Empregado {

    @Override
    public double calcSalario(){
        return this.calcSalario()/30;
    }
}
