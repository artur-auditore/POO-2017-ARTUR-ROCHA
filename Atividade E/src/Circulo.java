public class Circulo {
    private int raio;

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double calcArea(){
        return 3.14 * raio * raio;
    }

    public double calcPerimetro(){
        return 2 * 3.14 * raio;
    }
}

class TestaCiculo{
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(7);

        System.out.println(c.calcArea());
        System.out.println(c.calcPerimetro());
    }
}
