package App;

import Model.AtualizadorDeContas;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupança;

public class TestaAtualizadorDeContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas att = new AtualizadorDeContas(0.01);

        att.roda(c);
        att.roda(cc);
        att.roda(cp);

        System.out.println("Saldo Total: " + att.getSaldoTotal());
    }
}
