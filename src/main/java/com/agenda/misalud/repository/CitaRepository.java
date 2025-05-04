package com.agenda.misalud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agenda.misalud.model.Cita;

public interface CitaRepository extends MongoRepository<Cita, String>{
}

