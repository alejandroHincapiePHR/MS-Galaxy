package com.ms.negocio.gestionproductos.repository;

import com.ms.negocio.gestionproductos.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{

	
}
