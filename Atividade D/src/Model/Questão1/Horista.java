package Model.Questão1;

import Model.Questão1.Diarista;

public class Horista extends Diarista {

    @Override
    public double calcSalario(){
        return this.calcSalario()/24;
    }
}
