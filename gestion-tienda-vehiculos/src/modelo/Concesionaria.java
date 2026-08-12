package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public List<String> obtenerMarcasUnicas() {
        return inventario.stream()
                .map(Vehiculo::getMarca)
                .distinct()
                .collect(Collectors.toList());
    }

    public Optional<Vehiculo> obtenerVehiculoMasCaro() {
        return inventario.stream()
                .max(Comparator.comparingDouble(Vehiculo::calcularPrecioFinal));
    }

    public Map<String, Long> cuantosVehiculos() {
        return inventario.stream()
                .collect(Collectors.groupingBy(Vehiculo::getMarca, Collectors.counting()));
    }

    public Map<String, Long> cuantosVehiculosTipo() {
        return inventario.stream()
                .collect(Collectors.groupingBy(v -> v.getClass().getSimpleName(), Collectors.counting()));
    }

    public OptionalDouble calcularPrecioPromedio() {
        return inventario.stream()
                .mapToDouble(Vehiculo::calcularPrecioFinal)
                .average();
    }
}
