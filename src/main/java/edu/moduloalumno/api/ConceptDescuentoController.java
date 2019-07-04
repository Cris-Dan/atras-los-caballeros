package edu.moduloalumno.api;

import edu.moduloalumno.dao.IConceptoDescuentoDAO;
import edu.moduloalumno.entity.conceptoDescuento;
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

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/conceptodescuento")
public class ConceptDescuentoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IConceptoDescuentoDAO dao;
    @RequestMapping(value = "/obtener/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<conceptoDescuento>> getConceptoIdByApeNom(@PathVariable("codigo") String codigo) {
        logger.info("> getConceptoIdByCodigo [Concepto]");

        List<conceptoDescuento> list = null;

        try {
            list = dao.getAllConceptoDescuentoById(codigo);

            if (list == null) {
                list = new ArrayList<conceptoDescuento>();
            }
        } catch (Exception e) {
            logger.error("Unexpected Exception caught.", e);
            return new ResponseEntity<List<conceptoDescuento>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        logger.info("< getConceptoIdByCodigo [ConceptoDescuento]");
        return new ResponseEntity<List<conceptoDescuento>>(list, HttpStatus.OK);
    }
}
