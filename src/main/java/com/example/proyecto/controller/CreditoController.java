package com.example.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.proyecto.entity.Creditos;
import com.example.proyecto.service.CreditoService;

@RestController
@RequestMapping(path = "/creditos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST ,RequestMethod.DELETE ,RequestMethod.PUT})

public class CreditoController {

	
	@Autowired
	private CreditoService creditoService;
	
	
	@GetMapping
	@RequestMapping("/lisEvento")
	public List<Creditos> userList(){
		return creditoService.listEvent();
	}
	
	@PostMapping
	@RequestMapping("/saveCredito")
	public void crearEvento(@RequestBody  Creditos eventos){
		creditoService.SaveEvent(eventos);
	}
	
	
	@PutMapping
	@RequestMapping("/updateEvento")
	public void cupdateEvento(@RequestBody  Creditos eventos){
		creditoService.updateEvent(eventos);
	}
	
	
	@PostMapping
	@RequestMapping("/deleteEvento")
	public void deleteEvento(@RequestBody  Creditos eventos){
		creditoService.deleteEvent(eventos);
	}
	
	@GetMapping
	@RequestMapping("/listCredito/{id}")
	public List<Creditos> listCreditot(@PathVariable Long id){
		return creditoService.ListCreditoId(id);
	}
	
}
