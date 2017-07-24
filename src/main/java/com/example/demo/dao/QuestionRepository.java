package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Question;
/**
 * Created by Nazri on 17/7/17.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {
}
