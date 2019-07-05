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
        conceptoDescuento.setConcepto(row.getString("concepto"));
        conceptoDescuento.setDescripcion_min(row.getString("descripcion_min"));
        conceptoDescuento.setCredito(row.getInt("credito"));
        conceptoDescuento.setImporte(row.getInt("importe"));
        conceptoDescuento.setDescuento(row.getFloat("descuento(%)"));
        conceptoDescuento.setImporte_final(row.getFloat("importe_final"));
        conceptoDescuento.setCuotas(row.getInt("cuotas"));
        return conceptoDescuento;
    }
}
