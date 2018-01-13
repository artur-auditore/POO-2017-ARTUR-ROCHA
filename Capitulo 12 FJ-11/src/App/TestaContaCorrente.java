package App;

import Model.ContaCorrente;
import Model.SaldoInsuficienteException;

public class TestaContaCorrente {

    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();

        try {
            contaCorrente.setSaldo(100);
            contaCorrente.saca(220);
        } catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
