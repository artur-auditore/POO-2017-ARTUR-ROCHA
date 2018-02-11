package Model;

public class ContaPoupança extends Conta {

    public ContaPoupança(String titular) {
        super(titular);
    }

    @Override
    public void atualiza(double taxa) {
        this.setSaldo(getSaldo()+this.getSaldo()*taxa*3);
    }
}
