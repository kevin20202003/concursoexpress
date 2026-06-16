package com.uisrael.concursoexpress;

import org.junit.jupiter.api.Test;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ParticipanteEntity;

class ConcursoexpressApplicationTests {

	@Test
	void contextLoads() {
		ParticipanteEntity nuevo = new ParticipanteEntity();
		nuevo.setNombre("Kevin");
		nuevo.setApellido("Chala");
		System.out.println(nuevo.getNombre()+" "+nuevo.getApellido());
	}

}
