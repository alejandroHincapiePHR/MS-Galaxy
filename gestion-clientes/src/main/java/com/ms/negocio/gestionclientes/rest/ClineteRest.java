package com.ms.negocio.gestionclientes.rest;

import com.ms.negocio.gestionclientes.entity.ClienteEntity;
import com.ms.negocio.gestionclientes.service.ClineteService;
import com.ms.negocio.gestionclientes.service.ServiceException;
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
@RequestMapping("/v1/clinetes")
public class ClineteRest{

	private final ClineteService clienteService;
	
	@GetMapping
	public ResponseEntity<?> findByLikeObject() throws ServiceException {
		try {
			return ResponseEntity.ok(clienteService.findByLikeObject(null));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}	
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody ClienteEntity productoEntity) throws ServiceException{
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(productoEntity));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}	
	}
}
