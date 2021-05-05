package com.crud.api.entities.services;

import java.util.List;

import com.crud.api.entities.ToDo;

public interface ToDoService {
	
	public ToDo saveToDo(ToDo todo); //create new
	public ToDo  getToDo(String id);  //retrieve one
	public List<ToDo> getToDoList();  // retrieve all
	public void updateToDo(ToDo todo); // update by id
	public void  deleteToDo(String id); // delete by id

}
