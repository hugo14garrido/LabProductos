package com.labproductos.core.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labproductos.core.dao.ProductoDao;
import com.labproductos.core.model.Producto;

@Service("paroductoService")
@Transactional
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao productoServiceDao;

	@Override
	public void SaveProducto(Producto elemento) {
		// TODO Auto-generated method stub
		productoServiceDao.SaveProducto(elemento);
		
	}

	@Override
	public void deletProductoById(Long codigoProducto) {
		// TODO Auto-generated method stub
		productoServiceDao.deletProductoById(codigoProducto);
	}

	@Override
	public void updateProducto(Producto elemento) {
		// TODO Auto-generated method stub
		productoServiceDao.updateProducto(elemento);
	}

	@Override
	public Producto findById(Long codigoProducto) {
		// TODO Auto-generated method stub
		return productoServiceDao.findById(codigoProducto);
	}

	@Override
	public List<Producto> findAllProductos() {
		// TODO Auto-generated method stub
		return productoServiceDao.findAllProductos();
	}

	@Override
	public Producto findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return productoServiceDao.findByNombre(nombre);
	}

}
