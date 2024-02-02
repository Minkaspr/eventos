package com.mk.eventos.service;

import com.mk.eventos.entities.Evento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventoService {
    List<Evento> obtenerTodo();
    Evento obtenerPorId(Long id);
    Evento crearEvento(Evento evento);
    Evento actualizarEvento(Long id, Evento evento);
    void eliminarEvento(Long id);
}
