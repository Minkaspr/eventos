package com.mk.eventos.service.impl;

import com.mk.eventos.entities.Evento;
import com.mk.eventos.repository.EventoRepository;
import com.mk.eventos.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;
    @Override
    public List<Evento> obtenerTodo() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento obtenerPorId(Long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public Evento crearEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public Evento actualizarEvento(Long id, Evento evento) {
        Evento event = eventoRepository.findById(id).orElse(null);
        if(event !=null){
            event.setNombre(evento.getNombre());
            event.setFecha(evento.getFecha());
            event.setHora(evento.getHora());
            event.setLugar(evento.getLugar());
            event.setDescripcion(evento.getDescripcion());
            event.setAsistentes(evento.getAsistentes());
            event.setCancelado(evento.getCancelado());
            return eventoRepository.save(event);
        }
        return null;
    }

    @Override
    public void eliminarEvento(Long id) {
        eventoRepository.deleteById(id);
    }
}
