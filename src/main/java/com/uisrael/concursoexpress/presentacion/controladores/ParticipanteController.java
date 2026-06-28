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

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IParticipanteUseCase;
import com.uisrael.concursoexpress.presentacion.dto.request.ParticipanteRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.ParticipanteResponseDto;
import com.uisrael.concursoexpress.presentacion.mapeadores.IParticipanteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/participante")
public class ParticipanteController {
	
private final IParticipanteUseCase participanteUseCase;
	
	private final IParticipanteDtoMapper mapper;

	public ParticipanteController(IParticipanteUseCase participanteUseCase, IParticipanteDtoMapper mapper) {
		this.participanteUseCase = participanteUseCase;
		this.mapper = mapper;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ParticipanteResponseDto guardar(@Valid @RequestBody ParticipanteRequestDto request) {
		
		return mapper.toResponseDto(participanteUseCase.guardar(mapper.toDomain(request)));
	}
	
	@GetMapping
	public List<ParticipanteResponseDto> listarTodo() {
		
		return participanteUseCase.listarTodos().stream().map(mapper :: toResponseDto).toList();
	}
	
	@DeleteMapping("/{idParticipante}")
	public ResponseEntity<Void> eliminar(@PathVariable int idParticipante) {
		
		participanteUseCase.eliminar(idParticipante);
		return ResponseEntity.noContent().build();
	}

}
