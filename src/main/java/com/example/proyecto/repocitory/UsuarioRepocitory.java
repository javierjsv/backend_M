package com.example.proyecto.repocitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.proyecto.entity.Usuarios;

@Repository
public interface UsuarioRepocitory extends JpaRepository<Usuarios, Long> {
	
	@Query(value = "select * from usuarios where cedula=:cedula and password=:password ",nativeQuery = true)
	public List<Usuarios> login  (@Param("cedula") String cedula ,@Param("password") String password);
}
