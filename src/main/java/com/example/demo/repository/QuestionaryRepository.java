package com.example.demo.repository;

import com.example.demo.model.Options;
import com.example.demo.model.Questionary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionaryRepository extends CrudRepository<Questionary, Long> {
    public Optional<Questionary> findByName(String name);
}
