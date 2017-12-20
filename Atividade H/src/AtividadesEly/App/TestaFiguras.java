package AtividadesEly.App;

import AtividadesEly.Model.Quadrado;
import AtividadesEly.Model.Triangulo;

public class TestaFiguras {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        Quadrado quadrado2 = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        quadrado.setLado(8);
        quadrado2.setLado(5);

        System.out.println(quadrado.calcArea());
        System.out.println(quadrado.calcPerimetro());

        System.out.println(quadrado2.calcArea());
        System.out.println(quadrado2.calcPerimetro());

        System.out.println(quadrado.comparar(quadrado2));

        triangulo.setL1(5);
        triangulo.setL2(8);
        triangulo.setL3(4);

        System.out.println(triangulo.calcPerimetro());

        triangulo.setAlt(9);
        triangulo.setBase(4);
        triangulo2.setAlt(6);
        triangulo2.setBase(8);

        System.out.println(triangulo.calcArea());
        System.out.println(triangulo2.calcArea());

        System.out.println(triangulo.comparar(triangulo2));
    }
}
