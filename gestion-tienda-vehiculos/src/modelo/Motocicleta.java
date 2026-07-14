package modelo;

public class Motocicleta extends Vehiculo {
    protected int cilindraje;

    public Motocicleta(String marca, String modelo, int anio, double precioBase, int cilindraje) {
        super(marca, modelo, anio, precioBase);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecioFinal() {
        final double impuestos = this.precioBase * 0.08;
        return this.precioBase + impuestos;
    }
}
