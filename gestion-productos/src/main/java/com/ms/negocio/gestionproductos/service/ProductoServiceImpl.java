package com.ms.negocio.gestionproductos.service;

import java.util.List;
import java.util.Optional;

import com.ms.negocio.gestionproductos.entity.ProductoEntity;
import com.ms.negocio.gestionproductos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService{
	
	private final ProductoRepository productoRepository;

	@Override
	public List<ProductoEntity> findByLikeObject(ProductoEntity productoEntity) throws ServiceException {
		try {
			return productoRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}
	}

	@Override
	public Optional<ProductoEntity> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public ProductoEntity save(ProductoEntity productoEntity) throws ServiceException {
		try {
			return productoRepository.save(productoEntity);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException();
		}
	}

	@Override
	public ProductoEntity update(ProductoEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(ProductoEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
