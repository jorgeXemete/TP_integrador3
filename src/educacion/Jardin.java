package educacion;


public class Jardin extends Curso {

    private String sala; // Celeste, Verde, Azul, Roja

    public Jardin(String sala) {
        super("Jardín");
        this.sala = sala;
    }

    // Implementación del método abstracto
 
    public void mostrarInfo() {
        System.out.println("Sala: " + sala);
        System.out.println("Alumnos: " + alumnos);
        System.out.println("Docentes: " + docentes);
        if (alumnos.size() < 10) {
            System.out.println("Advertencia: Sala con menos de 10 alumnos, puede combinarse.");
        }
    }
}
