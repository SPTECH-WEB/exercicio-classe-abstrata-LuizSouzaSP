package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(){}

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "O quadrado tem os lados com o comprimento de " + lado;
    }
}
