package edu.moduloalumno.rowmapper;


import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionHistoria;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoMatriculaAutorizacionHistoriaRowMapper implements RowMapper<AlumnoMatriculaAutorizacionHistoria> {
    @Override
    public AlumnoMatriculaAutorizacionHistoria mapRow(ResultSet row, int rowNum) throws SQLException {
        AlumnoMatriculaAutorizacionHistoria alumnoMatriculaAutorizacionHistoria = new AlumnoMatriculaAutorizacionHistoria();
        alumnoMatriculaAutorizacionHistoria.setCod_alumno(row.getString("cod_alumno"));
        alumnoMatriculaAutorizacionHistoria.setAlumno(row.getString("alumno"));
        alumnoMatriculaAutorizacionHistoria.setCiclo(row.getInt("ciclo"));
        alumnoMatriculaAutorizacionHistoria.setCod_semestre(row.getString("cod_semestre"));
        alumnoMatriculaAutorizacionHistoria.setCreditos(row.getInt("creditos"));
        alumnoMatriculaAutorizacionHistoria.setSigla_programa(row.getString("sigla_programa"));
        return alumnoMatriculaAutorizacionHistoria;
    }
}
