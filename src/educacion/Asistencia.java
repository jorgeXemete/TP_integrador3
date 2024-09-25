package educacion;

public class Asistencia {
    private String alumno;
    private String fecha;
    private boolean asistio;

    public Asistencia(String alumno, String fecha, boolean asistio) {
        this.alumno = alumno;
        this.fecha = fecha;
        this.asistio = asistio;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "alumno='" + alumno + '\'' +
                ", fecha='" + fecha + '\'' +
                ", asistio=" + asistio +
                '}';
    }
}