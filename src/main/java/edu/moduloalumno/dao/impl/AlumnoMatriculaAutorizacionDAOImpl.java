package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoMatriculaAutorizacionDAO;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacion;
import edu.moduloalumno.rowmapper.AlumnoMatriculaAutorizacionRowMappper;

@Transactional
@Repository
public class AlumnoMatriculaAutorizacionDAOImpl implements IAlumnoMatriculaAutorizacionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<AlumnoMatriculaAutorizacion> getAllAlumnoMatriculaAutorizacion(){
        String sql = "SELECT id_autorizacion,cod_alumno,id_programa,semestre,n_autorizacion,anio_autorizacion,"+
                "fecha_emision,usuario_emision,importe,penalidad,amortizacion,saldo,fecha_vencimiento,id_rec,id_autoriz_estado "+
                "FROM alumno_matricula_autorizacion";

        RowMapper<AlumnoMatriculaAutorizacion> rowMapper = new AlumnoMatriculaAutorizacionRowMappper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }
    @Override
    public AlumnoMatriculaAutorizacion getAlumnoMatriculaAutorizacionById(int id_autorizacion){
        String sql = "SELECT id_autorizacion,cod_alumno,id_programa,semestre,n_autorizacion,anio_autorizacion,"+
                "fecha_omision,usuario_emision,importe,penalidad,amortizacion,saldo,fecha_vencimiento,id_rec,id_autoriz_estado "+
                "FROM alumno_matricula_autorizacion where id_autorizacion = "+id_autorizacion+" limit 1";
        RowMapper<AlumnoMatriculaAutorizacion> rowMapper = new BeanPropertyRowMapper<AlumnoMatriculaAutorizacion>(AlumnoMatriculaAutorizacion.class);
        AlumnoMatriculaAutorizacion alumnoMatriculaAutorizacion = jdbcTemplate.queryForObject(sql, rowMapper, id_autorizacion);
        return alumnoMatriculaAutorizacion;
    }

}