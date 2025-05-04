package com.agenda.misalud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agenda.misalud.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
}
