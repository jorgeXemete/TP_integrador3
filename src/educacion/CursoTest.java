package educacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
    public void testAgregarAlumno() {
        Primaria primaria = new Primaria(3);
        primaria.agregarAlumno("Juan");
        assertEquals(1, primaria.getAlumnos().size());
        assertEquals("Juan", primaria.getAlumnos().get(0));
    }

    @Test
    public void testRegistrarAsistencia() {
        Primaria primaria = new Primaria(3);
        primaria.registrarAsistencia("Juan", "2024-09-25", true);
        assertEquals(1, primaria.asistencias.size());
    }
}
