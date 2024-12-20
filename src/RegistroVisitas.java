import java.util.Scanner;

public class RegistroVisitas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos básicos del visitante
        System.out.print("Ingrese el nombre del visitante: ");
        String nombreVisitante = scanner.nextLine();

        System.out.print("Ingrese la cédula del visitante: ");
        int cedula = scanner.nextInt();

        System.out.print("Ingrese el teléfono del visitante: ");
        long telefono = scanner.nextLong();

        System.out.print("Ingrese la edad del visitante: ");
        byte edad = scanner.nextByte();

        // Variables para las visitas
        int totalVisitas = 0;
        double sumaTiempos = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la duración de la visita del día " + i + " en minutos: ");
            double duracionVisita = scanner.nextDouble();

            // Acumular las visitas y sus duraciones
            totalVisitas++;
            sumaTiempos += duracionVisita;
        }

        // Calcular el tiempo promedio de estadía
        double tiempoPromedio = sumaTiempos / totalVisitas;

        // Determinar si la persona es mayor o menor de edad
        boolean esMayorDeEdad = edad >= 18;

        // Imprimir la información recopilada
        System.out.println("\nInformación del Visitante:");
        System.out.println("Nombre: " + nombreVisitante);
        System.out.println("Cédula: " + cedula);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Total de visitas en la semana: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos");
        System.out.println("Es mayor de edad: " + esMayorDeEdad);

        scanner.close();
    }
}
