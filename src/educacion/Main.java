package educacion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de cada tipo de curso
        Jardin jardinSalaVerde = new Jardin("Verde");
        Primaria primariaTercerGrado = new Primaria(3);
        Secundaria secundariaPrimerAnio = new Secundaria(1, Arrays.asList("Matemática", "Historia", "Lengua"));

        // Agregar docentes a los cursos
        jardinSalaVerde.agregarDocente("Maestra Jardinera Carla");
        jardinSalaVerde.agregarDocente("Maestro Jardinero Pablo");

        primariaTercerGrado.agregarDocente("Profesor de Tercer Grado Mario");

        secundariaPrimerAnio.agregarDocente("Profesor de Matemática Luis");
        secundariaPrimerAnio.agregarDocente("Profesor de Historia Ana");

        // Agregar algunos alumnos
        jardinSalaVerde.agregarAlumno("Sofía");
        jardinSalaVerde.agregarAlumno("Tomás");

        primariaTercerGrado.agregarAlumno("Juan");
        primariaTercerGrado.agregarAlumno("María");

        secundariaPrimerAnio.agregarAlumno("Carlos");
        secundariaPrimerAnio.agregarAlumno("Lucía");

        // Registrar asistencia para alumnos
        jardinSalaVerde.registrarAsistencia("Sofía", "2024-09-25", true);
        primariaTercerGrado.registrarAsistencia("Juan", "2024-09-25", true);
        secundariaPrimerAnio.registrarAsistencia("Carlos", "2024-09-25", false);

        // Evaluar alumnos
        primariaTercerGrado.evaluarAlumno("María");
        secundariaPrimerAnio.evaluarMateria("Lucía", "Matemática");

        // Mostrar información de cada curso
        System.out.println("\n--- Información del Jardín ---");
        jardinSalaVerde.mostrarInfo();

        System.out.println("\n--- Información de la Primaria ---");
        primariaTercerGrado.mostrarInfo();

        System.out.println("\n--- Información de la Secundaria ---");
        secundariaPrimerAnio.mostrarInfo();
    }
}