package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.dao.IAlumnoMatriculaAutorizacionHistoriaDAO;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionHistoria;
@RestController
@RequestMapping("/alumnomatriculaautorizacionhistoria")
public class AlumnoMatriculaAutorizacionHistoriaController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IAlumnoMatriculaAutorizacionHistoriaDAO dao;

    @RequestMapping(value = "/buscar/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AlumnoMatriculaAutorizacionHistoria>> getAlumnoMatriculaAutorizacionHistoriaByCodAlumno(@PathVariable("codigo") String codigo) {
        logger.info("> getAlumnoMatriculaAutorizacionHistoriaByCodAlumno [AlumnoMatriculaAutorizacionHistoriaJSON]");

        List<AlumnoMatriculaAutorizacionHistoria> list = null;
        try {
            list = dao.getAlumnoMatriculaAutorizacionHistoriaByCodAlumno(codigo);

            if (list == null) {
                list = new ArrayList<AlumnoMatriculaAutorizacionHistoria>();
            }
            logger.info("list "+list);
        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<List<AlumnoMatriculaAutorizacionHistoria>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("< getAlumnoMatriculaAutorizacionHistoriaByCodAlumno [AlumnoMatriculaAutorizacionHistoriaJSON]");
        return new ResponseEntity<List<AlumnoMatriculaAutorizacionHistoria>>(list, HttpStatus.OK);
    }

}
