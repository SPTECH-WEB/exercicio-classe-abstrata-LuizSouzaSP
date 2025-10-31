package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(){}

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        Double resultado = Math.PI*(Math.pow(raio, 2));
        return resultado;
    }

    @Override
    public String toString() {
        return "O circulo tem um raio de " + raio;
    }
}
