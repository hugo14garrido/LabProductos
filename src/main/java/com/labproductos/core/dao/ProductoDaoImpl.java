package com.labproductos.core.dao;

import java.util.List;

import com.labproductos.core.dao.AbstractSession;
import com.labproductos.core.dao.ProductoDao;
import com.labproductos.core.model.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional

public class ProductoDaoImpl  extends AbstractSession implements ProductoDao{

	@Override
	public void SaveProducto(Producto elemento) {
		// TODO Auto-generated method stub
		getSession().persist(elemento);
	}

	@Override
	public void deletProductoById(Long codigoProducto) {
		
		Producto elemento = findById(codigoProducto);
		if (elemento != null) {
			getSession().delete(elemento);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProducto(Producto elemento) {
		// TODO Auto-generated method stub
		getSession().update(elemento);
	}

	@Override
	public Producto findById(Long codigoProducto) {
		// TODO Auto-generated method stub
		return (Producto)getSession().get(Producto.class, codigoProducto);
	}

	@Override
	public List<Producto> findAllProductos() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Producto").list();
	}

	@Override
	public Producto findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return (Producto) getSession().createQuery("from Producto where nombre = :nombre").setParameter("nombre", nombre).uniqueResult();
	}

}
