public class Retangulo {
    private int l1, l2;

    public void setRetangulo(int l1, int l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public int calcArea(){
        return l1 * l2;
    }

    public int calcPerimetro(){
        return (l1 + l2) * 2;
    }
}

class TestaRetanulo{
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setRetangulo(4, 5);
        System.out.println(r.calcArea());
        System.out.println(r.calcPerimetro());
    }
}