public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa) {
        this.setSaldo(getSaldo()+this.getSaldo()*taxa*2);
    }

    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    @Override
    public void saca(double valor) {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        if (valor < 0){
            throw new IllegalArgumentException();
        }else {
            super.saca(valor);
        }
    }
}
