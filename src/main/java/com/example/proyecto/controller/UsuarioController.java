package com.example.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.entity.Usuarios;
import com.example.proyecto.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuarios")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST ,RequestMethod.DELETE ,RequestMethod.PUT})

public class UsuarioController {

	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping
	@RequestMapping("/lisUser")
	public List<Usuarios> userList(){
		return usuarioService.listUser();
	}
	
	@PostMapping
	@RequestMapping("/saveUser")
	public void crearUser (@RequestBody  Usuarios usuarios) {
		usuarioService.saveUser(usuarios);
	}
	
	@PostMapping
	@RequestMapping("/login")
	public List<Usuarios> login (@RequestBody  Usuarios usuarios) {
		return usuarioService.login(usuarios);
	}
	
}
