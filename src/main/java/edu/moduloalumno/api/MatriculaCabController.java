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

import edu.moduloalumno.dao.IMatriculaCabDAO;
import edu.moduloalumno.entity.MatriculaCab;

@RestController
@RequestMapping("/matriculacab")
public class MatriculaCabController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IMatriculaCabDAO dao;

    @RequestMapping(value = "/estado/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MatriculaCab>> getAllMatriculaCab() {
        logger.info("> getAllMatriculaCab [MatriculaCabJSON]");

        List<MatriculaCab> list = null;
        try {
            list = dao.getAllMatriculaCab();

            if (list == null) {
                list = new ArrayList<MatriculaCab>();
            }

        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<List<MatriculaCab>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("< getAllMatriculaCab [MatriculaCabJSON]");
        return new ResponseEntity<List<MatriculaCab>>(list, HttpStatus.OK);
    }


    @RequestMapping(value = "/buscar/{idCab}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MatriculaCab> getConceptoById(@PathVariable("idCab") String idCab) {
        logger.info("> getCabeceraById [Cabecera]");

        MatriculaCab concepto = null;

        try {
            concepto =dao.getMatriculaCabBycodAlumno(idCab);

            if (concepto == null) {
                concepto = new MatriculaCab();
            }
        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<MatriculaCab>(concepto, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        logger.info("< getCabeceraById [Cabecera]");
        return new ResponseEntity<MatriculaCab>(concepto, HttpStatus.OK);
    }

}