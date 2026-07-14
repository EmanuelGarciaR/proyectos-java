import modelo.Alquilable;
import modelo.Auto;
import modelo.Camion;
import modelo.Concesionaria;
import modelo.Motocicleta;
import modelo.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Concesionaria concesionaria1 = new Concesionaria();
        concesionaria1.agregarVehiculo(new Auto("Toyota", "Corolla", 2020, 100, 4));
        concesionaria1.agregarVehiculo(new Auto("Porshe", "911", 2022, 200, 2));
        concesionaria1.agregarVehiculo(new Motocicleta("Ducati", "Streetfighter", 2020, 150, 1500));
        concesionaria1.agregarVehiculo(new Camion("Chevrolet", "noseee", 2025, 300, 60));

        System.out.println("El precio total de los vehiculos es : " + concesionaria1.calcularPrecioFinal());
        System.out.println("Total de vehiculos registrados: " + concesionaria1.getTotalVehiculosRegistrados());

        for (Vehiculo v : concesionaria1.getInventario()) {
            if (v instanceof Alquilable) {
                Alquilable alquilable = (Alquilable) v;
                System.out.printf("El vehículo si lo alquilamos por 5 días: %.2f%n",
                        alquilable.calcularCostoAlquiler(5));
            }
        }
    }
}
