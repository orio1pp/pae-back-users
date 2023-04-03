package com.example.demo.repository;

import com.example.demo.model.Answer;
import com.example.demo.model.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
