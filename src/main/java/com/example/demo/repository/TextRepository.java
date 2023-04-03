package com.example.demo.repository;

import com.example.demo.model.Text;
import org.springframework.data.repository.CrudRepository;

public interface TextRepository extends CrudRepository<Text, Long> {
}
