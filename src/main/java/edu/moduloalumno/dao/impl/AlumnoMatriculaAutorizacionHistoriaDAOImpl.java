package edu.moduloalumno.dao.impl;

import edu.moduloalumno.dao.IAlumnoMatriculaAutorizacionHistoriaDAO;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionHistoria;
import edu.moduloalumno.rowmapper.AlumnoMatriculaAutorizacionHistoriaRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class AlumnoMatriculaAutorizacionHistoriaDAOImpl implements IAlumnoMatriculaAutorizacionHistoriaDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<AlumnoMatriculaAutorizacionHistoria> getAlumnoMatriculaAutorizacionHistoriaByCodAlumno(String cod_alumno) {
        String sql = "select a.cod_semestre,b.cod_alumno, " +
                "concat(b.ape_paterno,' ',b.ape_materno,' ',b.nom_alumno) as alumno, " +
                "c.sigla_programa,max(num_ciclo) as ciclo,sum(num_credito) as creditos " +
                "from matricula_hist a, alumno_programa b, programa c " +
                "where a.cod_alumno=b.cod_alumno " +
                "and b.id_programa=c.id_programa " +
                "and a.cod_alumno=? " +
                "group by a.cod_semestre,b.cod_alumno, " +
                "concat(b.ape_paterno,' ',b.ape_materno,' ',b.nom_alumno), " +
                "c.sigla_programa";
        RowMapper<AlumnoMatriculaAutorizacionHistoria> rowMapper = new AlumnoMatriculaAutorizacionHistoriaRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper, cod_alumno);
    }
}
