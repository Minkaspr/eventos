package com.mk.eventos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "evento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;
    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "hora", nullable = false)
    private LocalTime hora;
    @Column(name = "lugar", nullable = false, length = 255)
    private String lugar;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "asistentes", nullable = false)
    private Integer asistentes;
    @Column(name = "cancelado", nullable = false)
    private Boolean cancelado = false;
}
