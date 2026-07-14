package modelo;

import java.util.ArrayList;
import java.util.List;

public class Concesionaria {
    private List<Vehiculo> inventario = new ArrayList<>();
    private static int totalVehiculosRegistrados = 0;

    public void agregarVehiculo(Vehiculo v) {
        inventario.add(v);
        totalVehiculosRegistrados++;
    }

    public void mostrarInventario() {
        for (Vehiculo v : inventario) {
            v.mostrarInfo();
        }
    }

    public List<Vehiculo> getInventario() {
        return inventario;
    }

    public double calcularPrecioFinal() {
        double precioFinal = 0;
        for (Vehiculo v : inventario) {
            precioFinal = v.calcularPrecioFinal();
        }
        return precioFinal;
    }

    public int getTotalVehiculosRegistrados() {
        return totalVehiculosRegistrados;
    }

}
