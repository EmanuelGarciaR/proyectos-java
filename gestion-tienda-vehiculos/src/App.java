import modelo.Auto;

public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto("Toyota", "Corolla", 2022, 25000, 4);
        System.out.println(auto1.getNumeroPuertas());
        System.out.println(auto1.calcularPrecioFinal());

    }
}
