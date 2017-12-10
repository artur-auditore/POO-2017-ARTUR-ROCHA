package Model;

public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa) {
        this.setSaldo(getSaldo()+this.getSaldo()*taxa*2);
    }

    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
