package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import edu.moduloalumno.entity.AlumnoMatriculaAutorizacionEstado;
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

import edu.moduloalumno.dao.IAlumnoMatriculaAutorizacionDAO;
import edu.moduloalumno.entity.AlumnoMatriculaAutorizacion;

@RestController
@RequestMapping("/alumnomatriculaautorizacion")
public class AlumnoMatriculaAutorizacionController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IAlumnoMatriculaAutorizacionDAO dao;

        @RequestMapping(value = "/todos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AlumnoMatriculaAutorizacion>> getAllAlumnoMatriculaAutorizacion() {
        logger.info("> getAllAlumnoMatriculaAutorizacion [AlumnoMatriculaAutorizacionJSON]");

        List<AlumnoMatriculaAutorizacion> list = null;
        try {
            list = dao.getAllAlumnoMatriculaAutorizacion();

            if (list == null) {
                list = new ArrayList<AlumnoMatriculaAutorizacion>();
            }
            logger.info("list "+list);
        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<List<AlumnoMatriculaAutorizacion>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("< getAllAutorizacionEstado [AutorizacionEstadoJSON]");
        return new ResponseEntity<List<AlumnoMatriculaAutorizacion>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/buscar/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AlumnoMatriculaAutorizacionEstado>> getAlumnoMatriculaAutorizacionEstadoById(@PathVariable("codigo") String codigo) {
        logger.info("> getAllAlumnoMatriculaAutorizacion [AlumnoMatriculaAutorizacionJSON]");

        List<AlumnoMatriculaAutorizacionEstado> amae = null;
        try {
            amae = dao.getAlumnoMatriculaAutorizacionEstadoById(codigo);

            if (amae == null) {
                amae = new ArrayList<AlumnoMatriculaAutorizacionEstado>();
            }
            logger.info("ama "+amae);
        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<List<AlumnoMatriculaAutorizacionEstado>>(amae, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("< getAllAutorizacionEstado [AutorizacionEstadoJSON]");
        return new ResponseEntity<List<AlumnoMatriculaAutorizacionEstado>>(amae, HttpStatus.OK);
    }



}