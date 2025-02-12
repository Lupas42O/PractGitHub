package repasoEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {
	static Alumno al;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		al = new Alumno(1, "Lucas", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularNotaFinal() {
		double resultado = al.calcularNotaFinal(5, 5, 5);
		assertEquals(5, resultado);
	}

}
