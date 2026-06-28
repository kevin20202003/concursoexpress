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

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IModalidadUseCase;
import com.uisrael.concursoexpress.presentacion.dto.request.ModalidadRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.ModalidadResponseDto;
import com.uisrael.concursoexpress.presentacion.mapeadores.IModalidadDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/modalidad")
public class ModalidadController {
	
private final IModalidadUseCase modalidadUseCase;
	
	private final IModalidadDtoMapper mapper;

	public ModalidadController(IModalidadUseCase modalidadUseCase, IModalidadDtoMapper mapper) {
		this.modalidadUseCase = modalidadUseCase;
		this.mapper = mapper;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ModalidadResponseDto guardar(@Valid @RequestBody ModalidadRequestDto request) {
		
		return mapper.toResponseDto(modalidadUseCase.guardar(mapper.toDomain(request)));
	}
	
	@GetMapping
	public List<ModalidadResponseDto> listarTodo() {
		
		return modalidadUseCase.listarTodos().stream().map(mapper :: toResponseDto).toList();
	}
	
	@DeleteMapping("/{idModalidad}")
	public ResponseEntity<Void> eliminar(@PathVariable int idModalidad) {
		
		modalidadUseCase.eliminar(idModalidad);
		return ResponseEntity.noContent().build();
	}

}
