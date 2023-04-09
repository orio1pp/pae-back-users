package com.example.demo.repository;

import com.example.demo.model.Spinner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpinnerRepository extends CrudRepository<Spinner, Long> {
}
