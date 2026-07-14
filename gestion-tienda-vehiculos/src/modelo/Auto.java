package modelo;

public class Auto extends Vehiculo implements Alquilable {
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

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (precioBase * 0.01) * dias;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

}
