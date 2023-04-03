package com.example.demo.repository;

import com.example.demo.model.CheckBox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckBoxRepository extends CrudRepository<CheckBox, Long> {
}
