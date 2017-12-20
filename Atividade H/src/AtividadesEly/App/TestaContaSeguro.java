package AtividadesEly.App;

import AtividadesEly.Model.AuditoriaInterna;
import AtividadesEly.Model.ContaCorrente;
import AtividadesEly.Model.SeguroDeVida;

public class TestaContaSeguro {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaCorrente contaCorrente1 = new ContaCorrente();

        contaCorrente.setSaldo(2300);
        contaCorrente1.setSaldo(1200);

        System.out.println(contaCorrente.calculaTributo());
        System.out.println(contaCorrente1.calculaTributo());

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        SeguroDeVida seguroDeVida1 = new SeguroDeVida();

        //Saldo - seguro de vida
        //System.out.println(contaCorrente.getSaldo() - seguroDeVida.calculaTributo());

        AuditoriaInterna auditoriaInterna = new AuditoriaInterna(2);
        auditoriaInterna.adicionar(seguroDeVida);
        auditoriaInterna.adicionar(seguroDeVida1);

        System.out.println(auditoriaInterna.calcularTributos());
    }
}
