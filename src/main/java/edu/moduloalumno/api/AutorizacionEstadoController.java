package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.dao.IAutorizacionEstadoDAO;
import edu.moduloalumno.entity.AutorizacionEstado;

@RestController
    @RequestMapping("/autorizacionestado")
public class AutorizacionEstadoController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IAutorizacionEstadoDAO dao;

    @RequestMapping(value = "/estado/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AutorizacionEstado>> getAllAutorizacionEstado() {
        logger.info("> getAllAutorizacionEstado");

        List<AutorizacionEstado> list = null;
        try {
            list = dao.getAllAutorizacionEstado();

            if (list == null) {
                list = new ArrayList<AutorizacionEstado>();
            }
            logger.info("list "+list);
        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<List<AutorizacionEstado>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("< getAllAutorizacionEstado [AutorizacionEstadoJSON]");
        return new ResponseEntity<List<AutorizacionEstado>>(list, HttpStatus.OK);
    }



}