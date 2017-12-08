package Model;

public class Horista extends Diarista {

    @Override
    public double calcSalario(){
        return this.calcSalario()/24;
    }
}
