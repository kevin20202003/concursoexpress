package com.uisrael.concursoexpress;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ParticipanteEntity;
import com.uisrael.concursoexpress.infraestructura.repositorio.IParticipanteJpaRepositorio;

@SpringBootTest
class ConcursoexpressApplicationTests {
	
	@Autowired
	IParticipanteJpaRepositorio repo;

	@Test
	void contextLoads() {
		ParticipanteEntity nuevo = new ParticipanteEntity();
		nuevo.setNombre("Kevin");
		nuevo.setApellido("Chala");
		System.out.println(nuevo.getNombre()+" "+nuevo.getApellido());
		repo.save(nuevo);
	}
}
