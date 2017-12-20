package FJ11.Model;

public class SeguroDeVida implements Tributavel{

    private double valor;
    private String titular;
    private int numeroApolice;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorImposto() {
        return 42 + this.valor * 0.02;
    }

    @Override
    public String getTitular() {
        return null;
    }

    @Override
    public String getTipo() {
        return null;
    }
}
