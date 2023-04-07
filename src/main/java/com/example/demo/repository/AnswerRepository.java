package com.example.demo.repository;

import com.example.demo.model.Answer;
import com.example.demo.model.Options;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

    @Query(value = "select count(*)" +
            "from Answer a " +
            "where a.answer like :answer "
    )
    public int getTimesSelected(@Param("answer") String answer);
}
