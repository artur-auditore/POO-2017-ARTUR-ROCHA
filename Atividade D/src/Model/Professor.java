package Model;

public class Professor extends Funcionário {
    private String titulação;

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }

    @Override
    public double setSalarioPrimeiraParcela() {
        return this.getSalário();
    }


}
