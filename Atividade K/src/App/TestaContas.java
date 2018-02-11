package App;

import Model.Conta;
import Model.ManipuladorDeContas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaContas {
    public static void main(String[] args) {

        ManipuladorDeContas manipuladorDeContas = new ManipuladorDeContas();

        Conta conta = new Conta("Jofrey");
        Conta conta1 = new Conta("Cersei");
        Conta conta2 = new Conta("Tyrion");
        Conta conta3 = new Conta("Snow");

        List<Conta> contas = new ArrayList<>();
        contas.add(conta);
        contas.add(conta1);
        contas.add(conta3);
        contas.add(conta2);

        //Ordena a Lista
        manipuladorDeContas.ordenaLista(contas);
        System.out.println("Lista ordenada");
        for (Conta x: contas){
            System.out.println(x.getTitular());
        }

        //Inverter a lista
        manipuladorDeContas.inverteLista(contas);
        System.out.println("Lista invertida");
        for (Conta x: contas){
            System.out.println(x.getTitular());
        }

        //Embaralha a lista
        manipuladorDeContas.embaralhaLista(contas);
        System.out.println("Lista embaralhada");
        for (Conta x: contas){
            System.out.println(x.getTitular());
        }
    }
}
