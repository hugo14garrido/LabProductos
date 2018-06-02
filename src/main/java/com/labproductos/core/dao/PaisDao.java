package com.labproductos.core.dao;
import java.util.List;

import com.labproductos.core.model.Pais;


public interface PaisDao {
	void SavePais (Pais elemento);
	void deletPaisById(Long codigoPais);
	void updatePais(Pais elemento);
	Pais findById (Long codigoPais);
	List<Pais> findAllPaises();
	Pais findByNombre (String descripcion);
}
