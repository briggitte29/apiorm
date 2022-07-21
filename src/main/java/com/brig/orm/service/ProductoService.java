package com.brig.orm.service;

import java.util.List;

import com.brig.orm.models.Producto;

public interface ProductoService {
	
	List<Producto> listar();
	Producto obtener(Integer id);
	void guardar(Producto producto);
	void eliminar(Integer id);
	void actualizar(Producto producto);

}
