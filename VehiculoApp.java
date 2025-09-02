        // Importa la librería Scanner, necesaria para leer datos desde el teclado
      import java.util.Scanner; 

       // Se define la clase principal del programa, debe llamarse igual que el archivo (VehiculoApp.java)
    class VehiculoApp {

       // Método principal, punto de entrada de la aplicación
    public static void main(String[] args) {

        // Se crea un objeto Scanner llamado "sc" para capturar datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // ====== ENTRADAS ======

        // Solicita al usuario ingresar la marca del vehículo y la almacena en una variable tipo String
        System.out.print("Marca: ");
        String marca = sc.nextLine();

        // Solicita el modelo del vehículo y lo guarda en otra variable String
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        // Solicita la cilindrada del vehículo (dato numérico), lo guarda en una variable tipo int
        System.out.print("Cilindrada (cc): ");
        int cilindrada = sc.nextInt();

        // Limpia el salto de línea pendiente después de leer un número (evita errores al leer un String después)
        sc.nextLine(); 

        // Solicita el tipo de combustible y lo guarda en un String
        System.out.print("Tipo de Combustible (gasolina/diesel/híbrido/eléctrico): ");
        String combustible = sc.nextLine();

        // Solicita la capacidad en pasajeros (dato numérico entero)
        System.out.print("Capacidad en pasajeros: ");
        int capacidad = sc.nextInt();

        // ====== SALIDAS ======

        // Muestra todos los datos ingresados en consola
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
