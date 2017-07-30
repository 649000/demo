package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.User;
import io.katharsis.repository.annotations.*;
import io.katharsis.queryParams.QueryParams;
import io.katharsis.resource.exception.ResourceNotFoundException;
/**
 * Created by Nazri on 13/7/17.
 **/

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@JsonApiResourceRepository(User.class)
public interface UserRepository extends CrudRepository<User, Long> {

}