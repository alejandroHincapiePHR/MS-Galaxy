package com.ms.negocio.gestionproductos.rest;

import com.ms.negocio.gestionproductos.entity.ProductoEntity;
import com.ms.negocio.gestionproductos.service.ProductoService;
import com.ms.negocio.gestionproductos.service.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/productos")
public class ProductoRest{

	private final ProductoService productoService;
	
	@GetMapping
	public ResponseEntity<?> findByLikeObject() throws ServiceException {
		try {
			return ResponseEntity.ok(productoService.findByLikeObject(null));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}	
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody ProductoEntity productoEntity) throws ServiceException{
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(productoService.save(productoEntity));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}	
	}
}
