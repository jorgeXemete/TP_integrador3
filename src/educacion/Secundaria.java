package educacion;

import java.util.List;

public class Secundaria extends Curso {

    private int anio;
    private List<String> materias;

    public Secundaria(int anio, List<String> materias) {
        super("Secundaria");
        this.anio = anio;
        this.materias = materias;
    }

    // Implementación del método abstracto
    
    public void mostrarInfo() {
        System.out.println("Año: " + anio);
        System.out.println("Materias: " + materias);
        System.out.println("Alumnos: " + alumnos);
        System.out.println("Docentes: " + docentes);
    }

    // Método para evaluar en una materia específica
    public void evaluarMateria(String alumno, String materia) {
        if (materias.contains(materia)) {
            System.out.println("El alumno " + alumno + " ha sido evaluado en la materia: " + materia);
        } else {
            System.out.println("Materia no encontrada.");
        }
    }
}