package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.conceptoDescuento;

public class ConceptoDescuentoRowMapper implements RowMapper<conceptoDescuento> {
    @Override
    public conceptoDescuento mapRow(ResultSet row, int rowNum) throws SQLException {
        conceptoDescuento conceptoDescuento = new conceptoDescuento();
        conceptoDescuento.setId_programa_ciclo(row.getInt("id_programa_ciclo"));
        conceptoDescuento.setId_concepto(row.getInt("id_concepto"));
        conceptoDescuento.setConcepto(row.getString("id_concepto"));
        conceptoDescuento.setDescripcion_min(row.getString("id_concepto"));
        conceptoDescuento.setCredito(row.getInt("id_concepto"));
        conceptoDescuento.setImporte(row.getInt("id_concepto"));
        conceptoDescuento.setDescuento(row.getFloat("id_concepto"));
        conceptoDescuento.setImporte_final(row.getFloat("id_concepto"));
        conceptoDescuento.setCuotas(row.getInt("id_concepto"));
        return conceptoDescuento;
    }
}
