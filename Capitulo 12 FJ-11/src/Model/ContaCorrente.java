package Model;

public class ContaCorrente extends Conta{

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void atualiza(double taxa) {
        this.setSaldo(getSaldo()+this.getSaldo()*taxa*2);
    }

    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(valor);
        }
        if (valor < 0){
            throw new IllegalArgumentException();
        }else {
            super.saca(valor);
        }
    }
}
