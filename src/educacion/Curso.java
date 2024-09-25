package educacion;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {

    // Atributos comunes
    public List<String> alumnos;
    public List<String> docentes;
    public List<Asistencia> asistencias;
    public String nivel;

    // Constructor
    public Curso(String nivel) {
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.asistencias = new ArrayList<>();
        this.nivel = nivel;
    }

    // Método para agregar alumnos
    public void agregarAlumno(String nombreAlumno) {
        alumnos.add(nombreAlumno);
    }

    // Método para agregar docentes
    public void agregarDocente(String nombreDocente) {
        docentes.add(nombreDocente);
    }

    // Método para registrar asistencia
    public void registrarAsistencia(String alumno, String fecha, boolean asistio) {
        asistencias.add(new Asistencia(alumno, fecha, asistio));
    }

    // Método abstracto que será implementado en las clases derivadas
    public abstract void mostrarInfo();

    // Método para obtener alumnos
    public List<String> getAlumnos() {
        return alumnos;
    }
}