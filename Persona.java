import java.time.LocalDate;
class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
      
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}