package com.crud.api.entities.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.entities.ToDo;
import com.crud.api.entities.services.ToDoServiceImpl;

@RestController
public class ToDoController {

	@Autowired
	private ToDoServiceImpl toDoService;
	
	public ToDoController(ToDoServiceImpl toDoService) {
		this.toDoService=toDoService;	
	}
	
	@GetMapping("/index")
	List<ToDo> findAll(){
		return this.toDoService.getToDoList();
	}
	
	@GetMapping("/showNewToDoForm")
	public String showNewToDoForm(Model model) {
		ToDo todo= new ToDo();
		
		model.addAttribute("todo", todo);
		return "newtodo";
		
	}
	@PostMapping("/saveToDoRecords")
	public String saveNewToDo( @ModelAttribute("todo") ToDo todo) {
		toDoService.saveToDo(todo);
		return "redirect:/";
	}
}
