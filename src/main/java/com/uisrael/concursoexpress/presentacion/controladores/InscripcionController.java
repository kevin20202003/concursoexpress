package com.uisrael.concursoexpress.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IInscripcionUseCase;
import com.uisrael.concursoexpress.presentacion.dto.request.InscripcionRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.InscripcionResponseDto;
import com.uisrael.concursoexpress.presentacion.mapeadores.IInscripcionDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/inscripcion")
public class InscripcionController {
	
private final IInscripcionUseCase inscripcionUseCase;
	
	private final IInscripcionDtoMapper mapper;

	public InscripcionController(IInscripcionUseCase inscripcionUseCase, IInscripcionDtoMapper mapper) {
		this.inscripcionUseCase = inscripcionUseCase;
		this.mapper = mapper;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public InscripcionResponseDto guardar(@Valid @RequestBody InscripcionRequestDto request) {
		
		return mapper.toResponseDto(inscripcionUseCase.guardar(mapper.toDomain(request)));
	}
	
	@GetMapping
	public List<InscripcionResponseDto> listarTodo() {
		
		return inscripcionUseCase.listarTodos().stream().map(mapper :: toResponseDto).toList();
	}
	
	@DeleteMapping("/{idInscripcion}")
	public ResponseEntity<Void> eliminar(@PathVariable int idInscripcion) {
		
		inscripcionUseCase.eliminar(idInscripcion);
		return ResponseEntity.noContent().build();
	}

}
