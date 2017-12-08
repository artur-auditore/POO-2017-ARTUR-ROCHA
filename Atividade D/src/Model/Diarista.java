package Model;

public class Diarista extends Empregado {

    @Override
    public double calcSalario(){
        return this.calcSalario()/30;
    }
}
