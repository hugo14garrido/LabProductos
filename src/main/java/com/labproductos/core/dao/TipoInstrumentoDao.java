package com.labproductos.core.dao;
import java.util.List;

import com.labproductos.core.model.TipoInstrumento;


public interface TipoInstrumentoDao {
	void SaveTipoInstrumento (TipoInstrumento elemento);
	void deleteTipoInstrumentoById(Long codigoTipoInstrumento);
	void updatePais(TipoInstrumento elemento);
	TipoInstrumento findById (Long codigoTipoInstrumento);
	List<TipoInstrumento> findAllTipoInstrumento();
	TipoInstrumento findByNombre (String descripcion);
}
