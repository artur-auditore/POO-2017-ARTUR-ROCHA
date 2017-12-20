package FJ11.Model;

public interface Conta {

    private double saldo;

    public void deposita(double valor);

    public void saca(double valor);

    public double getSaldo();

    public void atualiza(double taxa);

//    public abstract double debito(double taxa);
}
