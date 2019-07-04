package edu.moduloalumno.dao;

import edu.moduloalumno.entity.conceptoDescuento;

import java.util.List;

public interface IConceptoDescuentoDAO {
    List<conceptoDescuento> getAllConceptoDescuentoById(String codigo);
}
