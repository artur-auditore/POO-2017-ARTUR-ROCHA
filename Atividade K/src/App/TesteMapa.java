package App;

import Model.Conta;

import java.util.HashMap;
import java.util.Map;

public class TesteMapa {
    public static void main(String[] args) {
        Conta c1 = new Conta("Snow");
        c1.deposita(10000);

        Conta c2 = new Conta("Arya");
        c2.deposita(30000);

        Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}
