package com.crud.api.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.entities.ToDo;
import com.crud.api.exceptions.ResourceNotFoundException;
import com.crud.api.repos.ToDoRepository;
@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;
	
	@Override
	public ToDo saveToDo(ToDo todo) {
		return this.toDoRepository.save(todo);
	}

	@Override
	public ToDo getToDo(String id) {
		// TODO Auto-generated method stub
		return this.toDoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
	}

	@Override
	public List<ToDo> getToDoList() {
		
		return  this.toDoRepository.findAll();
	}

	@Override
	public void updateToDo(ToDo toDo) {
		this.toDoRepository.save(toDo);
	}

	@Override
	public void deleteToDo(String id) {
		
		this.toDoRepository.deleteById(id);
		
	}
	
	

}
