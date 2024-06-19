package TrabajoLioAgus.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import TrabajoLioAgus.demo.service.InstitucionService;

@RestController
@RequestMapping("/api")
public class InstitucionController {
     @Autowired
    private InstitucionService institucionService;
    private static final Logger logger = LoggerFactory.getLogger(InstitucionController.class);

    @RequestMapping(path = "nombreInstitucion")
    public ResponseEntity<String> getNombreInstitucion() {
        try {
            return new ResponseEntity<>(institucionService.getNombreInstitucion(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en InstitucionController > getNombreInstitucion: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(path = "direccionInstitucion")
    public ResponseEntity<String> getDireccion() {
        try {
            return new ResponseEntity<>(institucionService.getDireccion(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en InstitucionController > getDireccion: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(path = "añosInstitucion")
    public ResponseEntity<String> getAños() {
        try {
            return new ResponseEntity<>(institucionService.getAños(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en InstitucionController > getAños: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
