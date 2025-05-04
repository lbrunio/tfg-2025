package com.agenda.misalud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agenda.misalud.model.Medicamento;

public interface MedicamentoRepository extends MongoRepository<Medicamento, String>{
}