package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.MatriculaCab;

public class MatriculaCabRowMapper implements RowMapper<MatriculaCab> {
    @Override
    public MatriculaCab mapRow(ResultSet row, int rowNum) throws SQLException {
        MatriculaCab matriculaCab = new MatriculaCab();
        matriculaCab.setCod_alumno(row.getString("cod_alumno"));
        matriculaCab.setId_programa(row.getInt("id_programa"));
        matriculaCab.setSemestre(row.getString("semestre"));
        matriculaCab.setCiclo(row.getInt("ciclo"));
        return matriculaCab;
    }
}