package com.labproductos.core.dao;

import java.util.List;

import com.labproductos.core.model.Producto;
import com.labproductos.core.model.TipoInstrumento;

public class TipoInstrumentoDaoImpl extends AbstractSession implements TipoInstrumentoDao{

	@Override
	public void SaveTipoInstrumento(TipoInstrumento elemento) {
		// TODO Auto-generated method stub
		getSession().persist(elemento);
		
	}

	@Override
	public void deleteTipoInstrumentoById(Long codigoTipoInstrumento) {
		TipoInstrumento elemento = findById(codigoTipoInstrumento);
		if (elemento != null) {
			getSession().delete(elemento);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePais(TipoInstrumento elemento) {
		// TODO Auto-generated method stub
		getSession().update(elemento);
		
	}

	@Override
	public TipoInstrumento findById(Long codigoTipoInstrumento) {
		// TODO Auto-generated method stub
		return (TipoInstrumento)getSession().get(TipoInstrumento.class, codigoTipoInstrumento);
	}

	@Override
	public List<TipoInstrumento> findAllTipoInstrumento() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from TipoInstrumento").list();
	}

	@Override
	public TipoInstrumento findByNombre(String descripcion) {
		// TODO Auto-generated method stub
		return (TipoInstrumento) getSession().createQuery("from TipoInstrumento where descripcion = :descripcion").setParameter("descripcion", descripcion).uniqueResult();
	}

}
