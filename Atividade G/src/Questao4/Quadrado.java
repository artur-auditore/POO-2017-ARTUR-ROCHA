package Questao4;

public class Quadrado extends FiguraGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    @Override
    public int calcPerimetro() {
        return getLado() * 4;
    }

    @Override
    public int CalcArea(){
        return getLado() *4;
    }
}
