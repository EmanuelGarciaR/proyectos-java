package modelo;

public class Motocicleta extends Vehiculo implements Alquilable {
    protected int cilindraje;

    public Motocicleta(String marca, String modelo, int anio, double precioBase, int cilindraje) {
        super(marca, modelo, anio, precioBase);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecioFinal() {
        final double IMPUESTOS = this.precioBase * 0.08;
        return this.precioBase + IMPUESTOS;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (precioBase * 0.008) * dias;
    }
}
