
package model;

public class Veiculo {

    private double km;
    private double litro;

    // Construtor vazio
    public Veiculo() {
    }

    // Construtor com parâmetros
    public Veiculo(double km, double litro) {
        this.km = km;
        this.litro = litro;
    }

    // Getters e Setters
    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    // Método consumo
    public double consumo() {
        return km / litro;
    }
}
