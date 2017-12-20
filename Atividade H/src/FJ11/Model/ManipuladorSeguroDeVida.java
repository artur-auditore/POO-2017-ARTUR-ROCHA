package FJ11.Model;

public class ManipuladorSeguroDeVida {

    private SeguroDeVida seguroDeVida;

    public void criaSeguro(int numeroApolice, String titular, double valor){
        seguroDeVida = new SeguroDeVida();

        seguroDeVida.setNumeroApolice(numeroApolice);
        seguroDeVida.setValor(valor);
        seguroDeVida.setTitular(titular);
    }
}
