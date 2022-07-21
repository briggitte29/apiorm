package com.brig.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brig.orm.models.Producto;
import com.brig.orm.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		//sino encuentra nada devolvera nulo o vacio
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repository.save(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Producto producto) {
		repository.saveAndFlush(producto);

	}

}
