package TrabajoLioAgus.demo.service;

import TrabajoLioAgus.demo.models.Institucion;
import org.springframework.stereotype.Service;

@Service
public class InstitucionService {

    public String getNombreInstitucion() {

        Institucion UTN = new Institucion();
        String MiInstitucion = "El nombre de la Institución es: " + UTN.getNombre() ;
        return MiInstitucion;

    }
    public String getDireccion() {

        Institucion UTN = new Institucion();
        String MiDireccion = "La dirección es: " + UTN.getDireccion();
        return MiDireccion;
    }

    public String getAños() {
        Institucion UTN = new Institucion();
        String LosAños = "Los años de la institución son: " + UTN.getAños();
        return LosAños;
    }
}

