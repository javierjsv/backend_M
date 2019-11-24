package com.example.proyecto.repocitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto.entity.Creditos;
import com.example.proyecto.entity.Usuarios;

@Repository
public interface CreditoRepocitory extends JpaRepository<Creditos, Long> {

	public List<Creditos> findByUsuarioId(Long id);
}
