package com.example.demo.repository;

import com.example.demo.model.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends CrudRepository<Options, Long> {

}
