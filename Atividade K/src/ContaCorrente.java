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


}
