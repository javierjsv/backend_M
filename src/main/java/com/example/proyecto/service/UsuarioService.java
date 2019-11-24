package com.example.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.Usuarios;
import com.example.proyecto.repocitory.UsuarioRepocitory;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepocitory usuarioRepocitory;
	
	
	public List<Usuarios> listUser (){
		try {
			return usuarioRepocitory.findAll();
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	public List<Usuarios> login (Usuarios usuarios){
		try {
			Usuarios user = new Usuarios();
	
			return usuarioRepocitory.login(usuarios.getCedula(), usuarios.getPassword());
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	public void saveUser ( Usuarios usuarios){
		try {
			usuarioRepocitory.save(usuarios);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
}
