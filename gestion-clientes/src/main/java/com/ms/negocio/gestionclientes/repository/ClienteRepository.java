package com.ms.negocio.gestionclientes.repository;


import com.ms.negocio.gestionclientes.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

	
}
