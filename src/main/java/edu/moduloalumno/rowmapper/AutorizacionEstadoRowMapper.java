package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AutorizacionEstado;

public class AutorizacionEstadoRowMapper implements RowMapper<AutorizacionEstado> {
    @Override
    public AutorizacionEstado mapRow(ResultSet row, int rowNum) throws SQLException {
        AutorizacionEstado autorizacionEstado = new AutorizacionEstado();
        autorizacionEstado.setId_autorizacion_estado(row.getInt("id_autoriz_estado"));
        autorizacionEstado.setDesc_autorizacion_estado(row.getString("desc_autoriz_estado"));
        return autorizacionEstado;
    }
}