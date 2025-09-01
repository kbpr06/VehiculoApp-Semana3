import java.util.Scanner; // Para leer desde teclado

class VehiculoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entradas (String e int según corresponde)
        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Cilindrada (cc): ");
        int cilindrada = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea pendiente

        System.out.print("Tipo de Combustible (gasolina/diesel/híbrido/eléctrico): ");
        String combustible = sc.nextLine();

        System.out.print("Capacidad en pasajeros: ");
        int capacidad = sc.nextInt();

        // Salidas
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        sc.close();
    }
}
