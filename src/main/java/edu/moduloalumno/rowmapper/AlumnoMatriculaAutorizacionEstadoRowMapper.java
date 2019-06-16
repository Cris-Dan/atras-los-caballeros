package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionEstado;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoMatriculaAutorizacionEstadoRowMapper implements RowMapper<AlumnoMatriculaAutorizacionEstado> {

    @Override
    public AlumnoMatriculaAutorizacionEstado mapRow(ResultSet rs, int rowNum) throws SQLException {
        AlumnoMatriculaAutorizacionEstado amae = new AlumnoMatriculaAutorizacionEstado();

        amae.setId_utorizacion(rs.getInt("id_autorizacion"));
        amae.setCod_alumno(rs.getString("cod_alumno"));
        amae.setId_programa(rs.getInt("id_programa"));
        amae.setSemestre(rs.getString("semestre"));
        amae.setN_autorizacion(rs.getString("n_autorizacion"));
        amae.setFecha_emision(rs.getDate("fecha_emision"));
        amae.setUsuario_emision(rs.getString("usuario_emision"));
        amae.setImporte(rs.getFloat("importe"));
        amae.setPenalidad(rs.getFloat("penalidad"));
        amae.setAmortizacion(rs.getFloat("amortizacion"));
        amae.setSaldo(rs.getFloat("saldo"));
        amae.setFecha_vencimieto(rs.getDate("fecha_vencimiento"));
        amae.setId_rec(rs.getInt("id_rec"));
        amae.setAutorizacion_estado(rs.getString("desc_autoriz_estado"));
        return amae;
    }
}
