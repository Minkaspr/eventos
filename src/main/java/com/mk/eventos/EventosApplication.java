package com.mk.eventos;

import com.mk.eventos.entities.Evento;
import com.mk.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class EventosApplication implements CommandLineRunner {

	/*@Autowired
	private EventoRepository eventoRepository;*/
	public static void main(String[] args) {
		SpringApplication.run(EventosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		/*
		eventoRepository.save(new Evento(null, "Concierto de rock",
				LocalDate.of(2024, 2, 15), LocalTime.of(20, 0),
				"Estadio Nacional", "Disfruta de la mejor música en vivo",
				5000, false));


		Evento evento2 = new Evento();
		evento2.setNombre("Feria gastronómica");
		evento2.setFecha(LocalDate.of(2024, 3, 10));
		evento2.setHora(LocalTime.of(12, 0));
		evento2.setLugar("Parque Kennedy");
		evento2.setDescripcion("Degusta los mejores platos de la cocina peruana");
		evento2.setAsistentes(3000);
		evento2.setCancelado(false);
		eventoRepository.save(evento2);

		// Mostramos la cantidad de eventos registrados
		System.out.println("Numero de eventos de la tabla: " + eventoRepository.count());

		// Mostramos los nombres de cada evento registrado
		List<Evento> eventosList = eventoRepository.findAll();
		eventosList.forEach(e -> System.out.println("Nombre del evento" + e.getNombre()));*/
	}
}
