package com.mk.eventos.controller;

import com.mk.eventos.entities.Evento;
import com.mk.eventos.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public String listarEventos(Model model){
        List<Evento> eventosLis = eventoService.obtenerTodo();
        model.addAttribute("eventosLis", eventosLis);
        return "eventoSel.html";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model){
        model.addAttribute("evento",new Evento());
        model.addAttribute("accion", "/Eventos/nuevo");
        return "eventoIns.html";
    }

    @PostMapping("/nuevo")
    public String crearEvento(@ModelAttribute Evento evento){
        eventoService.crearEvento(evento);
        return "redirect:/Eventos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model){
        Evento evento = eventoService.obtenerPorId(id);
        model.addAttribute("evento",evento);
        model.addAttribute("accion", "/Eventos/editar/"+id);
        return "eventoUpd.html";
    }

    @PostMapping("/editar/{id}")
    public String editarEvento(@PathVariable Long id, @ModelAttribute Evento evento){
        eventoService.actualizarEvento(id,evento);
        return "redirect:/Eventos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEvento(@PathVariable Long id){
        eventoService.eliminarEvento(id);
        return "redirect:/Eventos";
    }
}
