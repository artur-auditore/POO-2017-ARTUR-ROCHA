package Questao4;

public class Triangulo extends FiguraGeometrica {

    private int l1, l2, l3;
    private int base, alt;

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    public int getL3() {
        return l3;
    }

    public int getBase() {
        return base;
    }

    public int getAlt() {
        return alt;
    }

    @Override
    public int calcPerimetro() {
        return getL1()+getL2()+getL3();
    }

    @Override
    public int CalcArea() {
        return getBase() * getAlt();
    }
}
