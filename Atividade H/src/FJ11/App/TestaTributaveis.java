package FJ11.App;

import FJ11.Model.ContaCorrente;
import FJ11.Model.Tributavel;

public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.getValorImposto());

        Tributavel t = cc;
        System.out.println(t.getValorImposto());

    }
}
