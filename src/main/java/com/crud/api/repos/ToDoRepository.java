package com.crud.api.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crud.api.entities.ToDo;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
	

}
