package modelo;

public class Camion extends Vehiculo {
    private double capacidadCargaToneladas;

    public Camion(String marca, String modelo, int anio, double precioBase, double capacidadCargaToneladas) {
        super(marca, modelo, anio, precioBase);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }

    @Override
    public double calcularPrecioFinal() {
        final double IMPUESTOS = this.precioBase * 0.2;
        if (this.capacidadCargaToneladas > 10) {
            System.out.println("Aplica recargo...");
            final int RECARGO = 500000;
            return this.precioBase + IMPUESTOS + RECARGO;
        } else {
            return this.precioBase + IMPUESTOS;
        }
    }
}
