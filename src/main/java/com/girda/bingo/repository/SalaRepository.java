package com.girda.bingo.repository;

import com.girda.bingo.entity.Sala;

import org.springframework.data.repository.CrudRepository;

public interface SalaRepository extends CrudRepository<Sala, Long> {
    Sala findById(long id);
}
