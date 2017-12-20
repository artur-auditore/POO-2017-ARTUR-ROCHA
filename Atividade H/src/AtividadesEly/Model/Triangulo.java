package AtividadesEly.Model;


public class Triangulo implements FiguraGeometrica, Comparavel {

    private int l1, l2, l3;
    private int base, alt;

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public int calcPerimetro() {
        return l1 + l2 +l3;
    }

    @Override
    public double calcArea() {
        return (base * alt)/2;
    }

    @Override
    public int comparar(FiguraGeometrica figura) {
        if (this.calcArea() < figura.calcArea()){
            return -1;
        }
        if (this.calcArea() > figura.calcArea()){
            return 1;
        }
        return 0;
    }
}
