package school.sptech;

abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura(String cor,Integer espessura){
        this.cor = cor;
        this.espessura = espessura;
    }

    protected Figura(){}

    public abstract Double calcularArea();

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Essa figura é da cor " + cor + " e da espessura " + espessura;
    }
}
