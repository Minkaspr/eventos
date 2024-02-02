package com.mk.eventos.controller;

import com.mk.eventos.entities.Evento;
import com.mk.eventos.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping()
    public String listarEventos(Model model){
        List<Evento> eventoList = eventoService.obtenerTodo();
        model.addAttribute("eventosLis", eventoList);
        return "eventoSel";
    }
}
