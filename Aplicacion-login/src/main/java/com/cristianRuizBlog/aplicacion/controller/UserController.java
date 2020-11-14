package com.cristianRuizBlog.aplicacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristianRuizBlog.aplicacion.entity.User;
import com.cristianRuizBlog.aplicacion.repository.RoleRepository;
import com.cristianRuizBlog.aplicacion.repository.UserRepository;
import com.cristianRuizBlog.aplicacion.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String userForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles", roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab", "active");
		
		return "user-form/user-view";
	}
}
