package com.ingeteam.taskapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ingeteam.taskapp.entity.User;
import com.ingeteam.taskapp.service.TaskService;
import com.ingeteam.taskapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	TaskService taskService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/tasks")
	public String getTasksList(Model model) {
		return "tasks";
	}
	
//	@PostMapping("/")
//	public String createUser(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap model) {
//		if(result.hasErrors()) {
//			model.addAttribute("/", new User());
//		}
//		
//		return "index";
//	}
}
