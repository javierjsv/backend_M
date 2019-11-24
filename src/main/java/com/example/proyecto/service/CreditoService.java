package com.example.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.Creditos;
import com.example.proyecto.entity.Usuarios;
import com.example.proyecto.repocitory.CreditoRepocitory;
import com.example.proyecto.repocitory.UsuarioRepocitory;

@Service
public class CreditoService {

	@Autowired
	private CreditoRepocitory creditoRepocitory;
	
	public List<Creditos> listEvent (){
	try {
		return creditoRepocitory.findAll();
	} catch (Exception e) {
		// TODO: handle exception
		return null;
	}
	
	}
	
	public List <Creditos> ListCreditoId (Long id){
	try {
		return creditoRepocitory.findByUsuarioId(id);
	} catch (Exception e) {
		// TODO: handle exception
		return null;
	}
	
	}
	
	
	
	public void SaveEvent(Creditos creditos) {
		try {
			creditoRepocitory.save(creditos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void updateEvent(Creditos creditos) {
		try {
			creditoRepocitory.save(creditos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteEvent(Creditos creditos) {
		try {
			creditoRepocitory.delete(creditos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
