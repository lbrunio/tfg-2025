package com.agenda.misalud.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
	
	private final String formatoNumeroMovil = "^[67][0-9]{8}$";
	private final int longitudMinimaContrasena = 8;
	private final int longitudMaximaContrasena = 32;

    @Id
    private String id;
    
    private String nombre_usuario;

    @Size(min = longitudMinimaContrasena, max = longitudMaximaContrasena, message = "La contraseña debe tener al menos 8 caracteres")
    private String contrasena;

    @Size(min = longitudMinimaContrasena, max = longitudMaximaContrasena, message = "La contraseña debe tener al menos 8 caracteres")
    private String contrasena_permitido;

    private String nombre;

    private String apellido1;

    private String apellido2;

    @Past(message = "La fecha de nacimiento debe ser en el pasado")
    private LocalDate fecha_nacimiento;

    private int edad;

    private boolean genero;

    private String ciudad;

    private String calle;

    @Min(value = 0, message = "El número tiene que ser 0 o mayor")
    private int numero_edificio;
    
    @Min(value = 0, message = "El número tiene que ser 0 o mayor")
    private int numero_planta;
    
    @Min(value = 0, message = "El número tiene que ser 0 o mayor")
    private int numero_hogar;

    @Email(message = "El email debe tener un formato válido")
    private String email;

    @Pattern(regexp = formatoNumeroMovil, message = "El número de móvil debe comenzar por 6 o 7 y tener 9 dígitos")
    private String numero_movil;

    @Pattern(regexp = formatoNumeroMovil, message = "El número de emergencia debe comenzar por 6 o 7 y tener 9 dígitos")
    private String numero_movil_emergencia;

    private boolean asmatico;

    private String grupo_sanguineo;

    private boolean donante_sangre;

    private String grado_discapacidad;
}
