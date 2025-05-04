package com.agenda.misalud.model;

import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "medicamentos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Medicamento {
	
	@Id
	private String id;
	
	private String nombre;
	
	@Min(value = 1, message = "El número tiene que ser 1 o mayor")
	private int dosis_diaria; // Número de tomas en un día
	
	@Min(value = 1, message = "El número tiene que ser 1 o mayor")
	private int dosis_frecuencia; // Cada cuántas horas se lo toma
	
	@Min(value = 1, message = "El número tiene que ser 1 o mayor")
	private int dosis_primer_dia; // Cuántas tomas hará el primer día
	
	@Min(value = 1, message = "El número tiene que ser 1 o mayor")
	private int total_dias_consumo; // Cuántos días se lo toma
	
	private LocalTime fecha_inicio;
	
	private LocalTime fecha_fin;
	
	private String dosis_total; // Número de tomas durante todos los días
	
	private String informacion_adicional;
	
	private String id_usuario;
}
