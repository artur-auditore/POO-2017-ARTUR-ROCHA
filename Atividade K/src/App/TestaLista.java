package App;

import Model.Conta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaLista {

    public static void main(String[] args) {

        List<Integer> arrayContas = new LinkedList<>();

        for (int i = 0; i <5; i++) {
            Random random = new Random();
            int x = random.nextInt();
            Conta conta = new Conta("");
            conta.setSaldo(x);
            arrayContas.add(x);
        }

        for (Integer c: arrayContas) {
            System.out.println(c.toString());
        }
    }
}
