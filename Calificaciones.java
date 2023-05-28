import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidadCalificaciones = scanner.nextInt();

        // Crear el array para almacenar las calificaciones
        double[] calificaciones = new double[cantidadCalificaciones];

        // Ingresar las calificaciones
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.print("Ingrese la calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        // Mostrar las calificaciones ingresadas
        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.println("Calificación #" + (i + 1) + ": " + calificaciones[i]);
        }
    }
}
