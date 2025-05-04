package com.agenda.misalud.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "citas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cita {
	
	@Id
	private String id;

	private String tipo;
	
	private String nombre_profesional;
	
	private String ciudad;
	
	private String calle;
	
	@Min(value = 0, message = "El número tiene que ser 0 o mayor")
	private int numero_recinto;
	
	@Min(value = 0, message = "El número tiene que ser 0 o mayor")
	private int numero_planta;

	@Future(message = "La fecha debe ser una fecha futura")
	private LocalDate fecha;
	
	private LocalTime hora;
	
	private String informacion_adicional;
	
	private String id_usuario;
}
