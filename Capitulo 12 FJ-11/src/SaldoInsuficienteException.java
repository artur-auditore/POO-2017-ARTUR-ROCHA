/**
 * Created by aluno on 11/01/18.
 */
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(double valor){
        super("Saldo Insuficiente para sacar o valor de: " + valor);
    }
}
