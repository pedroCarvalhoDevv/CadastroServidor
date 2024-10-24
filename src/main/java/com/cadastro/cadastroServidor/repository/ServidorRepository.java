package com.cadastro.cadastroServidor.repository;

import com.cadastro.cadastroServidor.model.entity.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServidorRepository extends JpaRepository <Servidor ,Long > {
}
