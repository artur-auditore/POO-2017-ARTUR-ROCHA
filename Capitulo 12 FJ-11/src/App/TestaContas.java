package App;

import Model.Conta;

public class TestaContas {

    public static void main(String[] args) {
        Conta conta = new Conta();

        try {
            conta.setSaldo(90000);
            conta.deposita(-10000);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
