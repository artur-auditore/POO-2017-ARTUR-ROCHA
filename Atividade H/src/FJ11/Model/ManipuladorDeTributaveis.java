package FJ11.Model;

public class ManipuladorDeTributaveis {

    private Tributavel[] tributaveis;
    private int indice;

    public ManipuladorDeTributaveis(int tamanho){
        this.tributaveis = new Tributavel[tamanho];
    }

    public void adicionar(Tributavel tributavel){
        this.tributaveis[indice] = tributavel;
        indice++;
    }

    public double calcularTributos(){
        double totalTributos = 0;

        for (int i=0; i<indice; i++){
            totalTributos += tributaveis[i].getValorImposto();
        }
        return totalTributos;
    }
}
