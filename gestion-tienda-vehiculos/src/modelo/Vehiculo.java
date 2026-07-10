package modelo;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Setters

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public void setAnio(int nuevoAnio) {
        if (nuevoAnio > 2000) {
            this.anio = nuevoAnio;
        } else {
            System.out.println("Año ingresado inválido");
        }
    }

    public void setPrecioBase(double nuevoPrecioBase) {
        if (nuevoPrecioBase > 0) {
            this.precioBase = nuevoPrecioBase;
        } else {
            System.out.println("Precio base ingresado inválido");
        }
    }

    public abstract double calcularPrecioFinal();

    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anio);
        System.out.println("Precio final: " + this.calcularPrecioFinal());
    }
}
