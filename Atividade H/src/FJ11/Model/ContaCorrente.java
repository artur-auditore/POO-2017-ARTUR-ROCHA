package FJ11.Model;

public class ContaCorrente implements Conta, Tributavel{

    @Override
    public double debito(double taxa) {
        return getSaldo() - (getSaldo()*taxa);
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public String getTitular() {
        return null;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public void deposita(double valor) {
        //corpo do metodo, me recuso a copiar e colar tudo
    }

    @Override
    public void saca(double valor) {

    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void atualiza(double taxa) {

    }
}
