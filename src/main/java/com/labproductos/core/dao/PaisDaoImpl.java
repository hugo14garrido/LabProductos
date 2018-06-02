package com.labproductos.core.dao;

import java.util.List;

import com.labproductos.core.dao.AbstractSession;
import com.labproductos.core.dao.PaisDao;
import com.labproductos.core.model.Pais;
import com.labproductos.core.model.Producto;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional

public class PaisDaoImpl  extends AbstractSession implements PaisDao{

	@Override
	public void SavePais(Pais elemento) {
		// TODO Auto-generated method stub
		getSession().persist(elemento);
		
	}

	@Override
	public void deletPaisById(Long codigoPais) {
		// TODO Auto-generated method stub
		Pais elemento = findById(codigoPais);
		if (elemento != null) {
			getSession().delete(elemento);
		}
		
	}

	@Override
	public void updatePais(Pais elemento) {
		// TODO Auto-generated method stub
		getSession().update(elemento);
		
	}

	@Override
	public Pais findById(Long codigoPais) {
		// TODO Auto-generated method stub
		return (Pais)getSession().get(Pais.class, codigoPais);
	}

	@Override
	public List<Pais> findAllPaises() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Pais").list();
	}

	@Override
	public Pais findByNombre(String descripcion) {
		// TODO Auto-generated method stub
		return (Pais) getSession().createQuery("from Pais where descripcion = :descripcion").setParameter("descripcion", descripcion).uniqueResult();
	}

}
