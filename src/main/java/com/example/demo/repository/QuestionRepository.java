package com.example.demo.repository;

import com.example.demo.model.Questionary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Questionary, Long> {

}
