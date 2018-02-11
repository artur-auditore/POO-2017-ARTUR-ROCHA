package Model;

import java.util.List;
import java.util.Map;

public class Banco {
    List <Conta> contas;
    private Map <String, Conta> mapa;

    public void adiciona(Conta conta){
        mapa.put(conta.getTitular(),conta);
    }

    public Conta pega(int x){

        return null;
    }

    public int pegaQuantidadeContas(){
        return contas.size();
    }

    public String buscaPorTitular(String nome){

        for (int i=0; i>contas.size(); i++){
            if(contas.get(i).getTitular().equals(nome)){
                return contas.get(i).getTitular();
            }
        }
        return nome;
    }
}
