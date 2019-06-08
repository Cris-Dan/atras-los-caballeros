package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAutorizacionEstadoDAO;
import edu.moduloalumno.entity.AutorizacionEstado;
import edu.moduloalumno.rowmapper.AutorizacionEstadoRowMapper;

@Transactional
@Repository
public class AutorizacionEstadoDAOImpl implements IAutorizacionEstadoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public AutorizacionEstado getAutorizacionEstadoById(int id_autorizacion_estado) {
        String sql = "SELECT id_autoriz_estado, desc_autoriz_estado FROM autorizacion_estado WHERE id_autorizacion = ?";
        RowMapper<AutorizacionEstado> rowMapper = new AutorizacionEstadoRowMapper();
        AutorizacionEstado autorizacionEstado = jdbcTemplate.queryForObject(sql, rowMapper, id_autorizacion_estado);
        return autorizacionEstado;
    }

    @Override
    public List<AutorizacionEstado> getAllAutorizacionEstado() {
        String sql = "SELECT id_autoriz_estado, desc_autoriz_estado FROM autorizacion_estado";

        RowMapper<AutorizacionEstado> rowMapper = new AutorizacionEstadoRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}