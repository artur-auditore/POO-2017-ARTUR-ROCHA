package Model;

import java.util.Collections;
import java.util.List;

public class ManipuladorDeContas {

    public void ordenaLista(List<Conta> c){
        List<Conta> contas = c;
        Collections.sort(contas);
    }

    public void inverteLista(List<Conta> c){
        List<Conta> contas = c;
        Collections.reverse(contas);

    }

    public void embaralhaLista(List<Conta> c){
        List<Conta> contas = c;
        Collections.shuffle(contas);
    }
}
