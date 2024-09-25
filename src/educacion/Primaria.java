package educacion;


public class Primaria extends Curso {

    private int grado;

    public Primaria(int grado) {
        super("Primaria");
        this.grado = grado;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("Grado: " + grado);
        System.out.println("Alumnos: " + alumnos);
        System.out.println("Docentes: " + docentes);
    }

    // Método para evaluar un alumno
    public void evaluarAlumno(String alumno) {
        System.out.println("El alumno " + alumno + " ha sido evaluado.");
    }
}