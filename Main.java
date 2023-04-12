import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        LocalDate fechaNacimiento = null;
        boolean fechaValida = false;
        while (!fechaValida) {
            System.out.print("Ingrese su fecha de nacimiento (aaaa-mm-dd): ");
            String fechaNacimientoStr = scanner.nextLine();

            try {
                fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("La fecha ingresada no es válida. Por favor, inténtelo nuevamente.");
            }
        }

        Persona persona = new Persona(nombre, apellido, edad, fechaNacimiento);

        System.out.println("Información de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }
}
