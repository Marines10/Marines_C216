package br.inatel.labs.labrest.server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

//Exception criada para indicar  um curso não é  encontrado pelo id de entrada

public class CursoNaoEncontradoException extends ResponseStatusException {


    public CursoNaoEncontradoException(Long cursoId) {
        super(HttpStatus.NOT_FOUND, String.format("Curso não encontrado com id %s", cursoId));
    }
}
