package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.User;
/**
 * Created by Nazri on 13/7/17.
 **/

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}