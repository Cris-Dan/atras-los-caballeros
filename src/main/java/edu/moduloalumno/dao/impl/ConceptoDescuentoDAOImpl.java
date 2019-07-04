package edu.moduloalumno.dao.impl;

import edu.moduloalumno.dao.IConceptoDescuentoDAO;
import edu.moduloalumno.entity.conceptoDescuento;
import edu.moduloalumno.rowmapper.ConceptoDescuentoRowMapper;
import edu.moduloalumno.rowmapper.ConceptoRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class ConceptoDescuentoDAOImpl implements IConceptoDescuentoDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<conceptoDescuento> getAllConceptoDescuentoById(String codigo) {
        String sql =  "select id_programa_ciclo,d.id_concepto,d.concepto,d.descripcion_min,b.credito,b.importe,fn_getbeneficio(c.cod_alumno,c.id_programa) as \"descuento(%)\",((100 - fn_getbeneficio(c.cod_alumno,c.id_programa))/100)*b.importe as importe_final, b.cuotas from programa_presupuesto a inner join programa_presupuesto_det b on a.id_programa_presupuesto=b.id_programa_presupuesto inner join alumno_programa c on a.id_programa_presupuesto=c.id_programa_presupuesto inner join concepto d on b.id_concepto=d.id_concepto where c.cod_alumno=? and c.id_programa=8 order by id_programa_ciclo,descripcion_min;";
        RowMapper<conceptoDescuento> rowMapper = new ConceptoDescuentoRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper, codigo);
    }
}
