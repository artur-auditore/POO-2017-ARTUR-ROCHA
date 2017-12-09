package Model.Questão3Extra;

public class Veículo {
    private String placa;
    private int ano;

    public Veículo(String placa, int ano){
        this.setPlaca(placa);
        this.setAno(ano);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
