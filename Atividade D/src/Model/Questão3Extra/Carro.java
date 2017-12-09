package Model.Questão3Extra;

public class Carro extends Veículo{
    private String modelo;

    public Carro(String modelo, String placa, int ano){
        super(placa, ano);
        setModelo(modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
