package Model;

public class ContaPoupança extends Conta {

    @Override
    public void atualiza(double taxa) {
        this.setSaldo(getSaldo()+this.getSaldo()*taxa*3);
    }
}
