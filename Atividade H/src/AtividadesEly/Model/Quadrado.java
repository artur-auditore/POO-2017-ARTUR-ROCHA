package AtividadesEly.Model;

public class Quadrado implements FiguraGeometrica, Comparavel {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcPerimetro() {
        return getLado() * 4;
    }

    @Override
    public double calcArea() {
        return getLado() * getLado();
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
