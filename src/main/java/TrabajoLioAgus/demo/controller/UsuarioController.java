package TrabajoLioAgus.demo.controller;

import TrabajoLioAgus.demo.models.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import TrabajoLioAgus.demo.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping("holaUsuario1")
    public String holaUsuario() {
        return "Hola, Usuario!";
    }

    @GetMapping(path = "ejercicioUno")
    public ResponseEntity<String> getEjercicioUno() {
        try {
            return new ResponseEntity<>(usuarioService.ejercicioUno(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en UsuarioController > ejercicioUno; {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "ejercicioDos")
    public ResponseEntity<String> getEjercicioDos() {
        try {
            return new ResponseEntity<>(usuarioService.ejercicioDos(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en UsuarioController > ejercicioDos; {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "ejercicioTres")
    public ResponseEntity<String> getEjercicioTres() {
        try {
            return new ResponseEntity<>(usuarioService.ejercicioTres(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en UsuarioController > ejercicioTres; {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "ejercicioCuatro")
    public ResponseEntity<String> getEjercicioCuatro() {
        try {
            return new ResponseEntity<>(usuarioService.ejercicioCuatro(), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error en UsuarioController > ejercicioCuatro; {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


