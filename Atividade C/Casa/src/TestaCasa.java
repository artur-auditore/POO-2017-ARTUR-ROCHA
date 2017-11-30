public class TestaCasa {
    public static void main(String[] args) {
        Casa casinha = new Casa();

        casinha.pinta("vermelha");
        casinha.totalDePortas = 5;
        casinha.p1.aberta=true;
        casinha.p2.aberta=true;
        casinha.p3.aberta=false;
        casinha.p4.aberta=false;
        casinha.p5.aberta=true;

       // casinha.totalDePortas();
    }
}
