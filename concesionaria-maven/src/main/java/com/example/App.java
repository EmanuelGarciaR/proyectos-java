package com.example;

import modelo.Alquilable;
import modelo.Auto;
import modelo.Camion;
import modelo.Concesionaria;
import modelo.Motocicleta;
import modelo.Vehiculo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        Concesionaria concesionaria1 = new Concesionaria();
        concesionaria1.agregarVehiculo(new Auto("Toyota", "Corolla", 2020, 100, 4));
        concesionaria1.agregarVehiculo(new Auto("Porshe", "911", 2022, 200, 2));
        concesionaria1.agregarVehiculo(new Motocicleta("Ducati", "Streetfighter", 2020, 150, 1500));
        concesionaria1.agregarVehiculo(new Camion("Chevrolet", "noseee", 2025, 300, 60));

        System.out.println("El precio total de los vehiculos es : " + concesionaria1.calcularPrecioFinal());
        System.out.println("Total de vehiculos registrados: " + concesionaria1.getTotalVehiculosRegistrados());

        List<String> marcasUnicas = concesionaria1.obtenerMarcasUnicas();
        System.out.println("Marcas Únicas: " + marcasUnicas);

        Optional<Vehiculo> vehiculoMasCaro = concesionaria1.obtenerVehiculoMasCaro();
        vehiculoMasCaro.ifPresentOrElse(v -> v.mostrarInfo(),
                () -> System.out.println("No hay vehiculos para mostrar"));

        Map<String, Long> vehiculosTipos = concesionaria1.cuantosVehiculosTipo();
        System.out.println(vehiculosTipos);

        Map<String, Long> vehiculosMarca = concesionaria1.cuantosVehiculos();
        System.out.println(vehiculosMarca);

        System.out.println("Los vehiculos que implementan Alquilable son los siguientes: ");
        List<Vehiculo> alquilables = concesionaria1.listarAlquilables();
        for (Vehiculo vehiculo : alquilables) {
            if (vehiculo instanceof Alquilable) {
                System.out.println(vehiculo.getMarca());
            }
        }

    }
}
