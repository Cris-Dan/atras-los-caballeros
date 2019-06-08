package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoMatriculaAutorizacion;

public class AlumnoMatriculaAutorizacionRowMappper implements RowMapper<AlumnoMatriculaAutorizacion> {

    @Override
    public AlumnoMatriculaAutorizacion mapRow(ResultSet rs, int rowNum) throws SQLException {
        AlumnoMatriculaAutorizacion ama = new AlumnoMatriculaAutorizacion();

        ama.setId_autorizacion_estado(rs.getInt("id_autorizacion"));
        ama.setCod_alumno(rs.getString("cod_alumno"));
        ama.setId_programa(rs.getInt("id_programa"));
        ama.setSemestre(rs.getString("semestre"));
        ama.setN_autorizacion(rs.getString("n_autorizacion"));
        ama.setFecha_emision(rs.getDate("fecha_emision"));
        ama.setUsuario_emision(rs.getString("usuario_emision"));
        ama.setImporte(rs.getFloat("importe"));
        ama.setPenalidad(rs.getFloat("penalidad"));
        ama.setAmortizacion(rs.getFloat("amortizacion"));
        ama.setSaldo(rs.getFloat("saldo"));
        ama.setFecha_vencimieto(rs.getDate("fecha_vencimiento"));
        ama.setId_rec(rs.getInt("id_rec"));
        ama.setId_autorizacion_estado(rs.getInt("id_autoriz_estado"));
        return ama;
    }

}