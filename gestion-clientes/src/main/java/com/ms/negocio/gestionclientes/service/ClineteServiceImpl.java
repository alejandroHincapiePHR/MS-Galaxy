package com.ms.negocio.gestionclientes.service;


import java.util.List;
import java.util.Optional;

import com.ms.negocio.gestionclientes.entity.ClienteEntity;
import com.ms.negocio.gestionclientes.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@Service
public class ClineteServiceImpl implements ClineteService{
	
	private final ClienteRepository clienteRepository;

	@Override
	public List<ClienteEntity> findByLikeObject(ClienteEntity productoEntity) throws ServiceException {
		try {
			return clienteRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}
	}

	@Override
	public Optional<ClienteEntity> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public ClienteEntity save(ClienteEntity productoEntity) throws ServiceException {
		try {
			return clienteRepository.save(productoEntity);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}
	}

	@Override
	public ClienteEntity update(ClienteEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(ClienteEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
