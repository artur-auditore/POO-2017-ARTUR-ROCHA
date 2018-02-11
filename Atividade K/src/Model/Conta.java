package Model;


public class Conta implements Comparable<Conta>{

    protected double saldo;
    private String titular;

    public Conta(String titular){

        this.titular = titular;
        this.saldo = 0;
    }

    public void deposita(double valor){

        if (valor < 0){
            throw new IllegalArgumentException();
        }else {
            this.saldo += valor;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void atualiza(double taxa) {

    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
