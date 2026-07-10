## Ejercicio: Sistema de gestión de una tienda de vehículos

**Enunciado:**

Debes modelar un pequeño sistema para una concesionaria que vende y alquila vehículos. El sistema debe cumplir con los siguientes requisitos:

### 1. Clase base abstracta `Vehiculo`
Debe tener como atributos (encapsulados, con sus getters correspondientes):
- `marca` (String)
- `modelo` (String)
- `anio` (int)
- `precioBase` (double)

Debe incluir:
- Un constructor que reciba todos los atributos.
- Un método abstracto `calcularPrecioFinal()` que devuelva un `double` — cada tipo de vehículo lo calculará distinto (ver más abajo).
- Un método concreto `mostrarInfo()` que imprima marca, modelo, año y el precio final (usando `calcularPrecioFinal()`).

### 2. Subclases de `Vehiculo`
- **`Auto`**: añade un atributo `numeroPuertas` (int). Su `calcularPrecioFinal()` es `precioBase` + un 15% de impuestos.
- **`Motocicleta`**: añade un atributo `cilindraje` (int). Su `calcularPrecioFinal()` es `precioBase` + un 8% de impuestos.
- **`Camion`**: añade un atributo `capacidadCargaToneladas` (double). Su `calcularPrecioFinal()` es `precioBase` + un 20% de impuestos, y si `capacidadCargaToneladas` supera las 10 toneladas, se le suma un recargo fijo de $500.000.

### 3. Interfaz `Alquilable`
Con un método `double calcularCostoAlquiler(int dias);`

- Que **`Auto`** y **`Motocicleta`** implementen esta interfaz (los camiones **no** se alquilan, solo se venden).
- El costo de alquiler es: `(precioBase * 0.01) * dias` para autos, y `(precioBase * 0.008) * dias` para motocicletas.

### 4. Clase `Concesionaria`
- Contiene una `List<Vehiculo>` con el inventario (**composición**).
- Métodos:
  - `agregarVehiculo(Vehiculo v)`
  - `mostrarInventario()`: recorre la lista e imprime la info de cada vehículo (aquí debe verse el **polimorfismo** en acción: cada vehículo calcula su precio final a su manera).
  - `calcularValorTotalInventario()`: devuelve la suma de `calcularPrecioFinal()` de todos los vehículos.
  - Un atributo **`static`** `totalVehiculosRegistrados` que se incremente cada vez que se agregue un vehículo al inventario (a través de cualquier instancia de `Concesionaria`).

### 5. Clase `Main`
- Crea una `Concesionaria`.
- Agrega al menos 2 autos, 1 motocicleta y 1 camión.
- Muestra el inventario completo.
- Muestra el valor total del inventario.
- Para los vehículos que implementen `Alquilable`, calcula y muestra el costo de alquilarlos por 5 días.
- Imprime `Concesionaria.totalVehiculosRegistrados` al final.

---

**Conceptos que este ejercicio te obliga a aplicar:**
- Clase abstracta + método abstracto
- Herencia (`extends`) y uso de `super`
- Polimorfismo (sobrescritura de `calcularPrecioFinal()`)
- Interfaz (`implements`) aplicada solo a algunas subclases
- Encapsulamiento (atributos `private` + getters)
- Composición (`Concesionaria` tiene una lista de `Vehiculo`)
- `static` (contador compartido entre instancias)

Cuando tengas tu código, lo reviso con toda sinceridad — errores de diseño, malas prácticas, cosas que sí quedaron bien, todo.