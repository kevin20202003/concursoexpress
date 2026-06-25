package com.uisrael.concursoexpress.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.ICategoriaUseCase;
import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IInscripcionUseCase;
import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IModalidadUseCase;
import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IParticipanteUseCase;
import com.uisrael.concursoexpress.aplicacion.casouso.impl.CategoriaUseCaseImpl;
import com.uisrael.concursoexpress.aplicacion.casouso.impl.InscripcionUseCaseImpl;
import com.uisrael.concursoexpress.aplicacion.casouso.impl.ModalidadUseCaseImpl;
import com.uisrael.concursoexpress.aplicacion.casouso.impl.ParticipanteUseCaseImpl;
import com.uisrael.concursoexpress.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.concursoexpress.dominio.repositorio.IInscripcionRepositorio;
import com.uisrael.concursoexpress.dominio.repositorio.IModalidadRepositorio;
import com.uisrael.concursoexpress.dominio.repositorio.IParticipanteRepositorio;
import com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores.CategoriaRepositorioImpl;
import com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores.InscripcionRepositorioImpl;
import com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores.ModalidadRepositorioImpl;
import com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores.ParticipanteRepositorioImpl;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.IInscripcionJpaMapper;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.IModalidadJpaMapper;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.IParticipanteJpaMapper;
import com.uisrael.concursoexpress.infraestructura.repositorio.ICategoriaJpaRepositorio;
import com.uisrael.concursoexpress.infraestructura.repositorio.IInscripcionJpaRepositorio;
import com.uisrael.concursoexpress.infraestructura.repositorio.IModalidadJpaRepositorio;
import com.uisrael.concursoexpress.infraestructura.repositorio.IParticipanteJpaRepositorio;

@Configuration
public class ConcursoExpressConfig {
	
	@Bean
	ICategoriaRepositorio categoriaRepositorio(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper mapper) {
		return new CategoriaRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	ICategoriaUseCase categoriaUseCase(ICategoriaRepositorio repositorio) {
		return new CategoriaUseCaseImpl(repositorio);
	}
	
	@Bean
	IParticipanteRepositorio participanteRepositorio(IParticipanteJpaRepositorio jpaRepositorio, IParticipanteJpaMapper mapper) {
		return new ParticipanteRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IParticipanteUseCase participanteUseCase(IParticipanteRepositorio repositorio) {
		return new ParticipanteUseCaseImpl(repositorio);
	}
	
	@Bean
	IInscripcionRepositorio inscripcionRepositorio(IInscripcionJpaRepositorio jpaRepositorio, IInscripcionJpaMapper mapper) {
		return new InscripcionRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IInscripcionUseCase inscripcionUseCase(IInscripcionRepositorio repositorio) {
		return new InscripcionUseCaseImpl(repositorio);
	}
	
	@Bean
	IModalidadRepositorio modalidadRepositorio(IModalidadJpaRepositorio jpaRepositorio, IModalidadJpaMapper mapper) {
		return new ModalidadRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IModalidadUseCase modalidadUseCase(IModalidadRepositorio repositorio) {
		return new ModalidadUseCaseImpl(repositorio);
	}

}
