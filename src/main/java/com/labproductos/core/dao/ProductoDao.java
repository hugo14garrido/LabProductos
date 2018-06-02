package com.labproductos.core.dao;
import java.util.List;

import com.labproductos.core.model.Producto;


public interface ProductoDao {
	void SaveProducto (Producto elemento);
	void deletProductoById(Long codigoProducto);
	void updateProducto(Producto elemento);
	Producto findById (Long codigoProducto);
	List<Producto> findAllProductos();
	Producto findByNombre (String nombre);
}
