package modelo;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int anio, double precioBase, int numeroPuertas) {
        super(marca, modelo, anio, precioBase);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularPrecioFinal() {
        double IMPUESTOS = this.precioBase * 0.15;
        return this.precioBase + IMPUESTOS;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

}
