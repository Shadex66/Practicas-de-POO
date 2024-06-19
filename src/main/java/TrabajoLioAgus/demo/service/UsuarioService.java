package TrabajoLioAgus.demo.service;
import TrabajoLioAgus.demo.models.Usuario;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    public String getNombreUsuario() {
        Usuario Nombre = new Usuario();
        String saludoAAgus = "Hola, soy " + Nombre.getNombre() + ".";
        return saludoAAgus;
    }

    public String getApellidoUsuario() {

        Usuario Apellido = new Usuario();
        String miApellido = "Mi apellido es: " + Apellido.getApellido();
        return miApellido;
    }

    public Integer getUsuarioEdad() {

        return 0;
    }

    public String getUsuarioEmail() {
        return "";
    }

    public String comparacionDeEdad() {
        Usuario Agus = new Usuario();
        if (Agus.getEdad() >= 18) {
            String mayorDeEdad = "Es mayor de edad";
            return mayorDeEdad;
        } else {
            String menorDeEdad = "Es menor de edad";
            return menorDeEdad;
        }
    }

    public String ejercicioUno() {
        Usuario usuario = new Usuario();
        if (usuario.getNombre() == "Lio") {
            String holaUsuario = "Hola Lio";
            return holaUsuario;
        } else {
            String holaOtro = "Hola " + usuario.getNombre();
            return holaOtro;
        }
    }

    public String ejercicioDos() {
        Usuario usuario2 = new Usuario();
        switch (usuario2.getApellido()) {
            case "Lombardi":
            case "Ricco":
            case "Alcaraz":
            case "Frutos":
                return usuario2.getApellido();
            default:
                return "El apellido no está en la DB";
        }
    }
    public String ejercicioTres() {

        Usuario Datos = new Usuario();
        String misDatos = "Mis datos son :" + Datos.getNombre() + " " + Datos.getApellido() + ", de " + Datos.getEdad() + " años y el email es " + Datos.getEmail() + ".";
        return misDatos;

    }

    public String ejercicioCuatro() {

        Usuario Datos = new Usuario();
        String misDatos = "Mis datos son :" + Datos.getNombre() + " " + Datos.getApellido() + ", de " + Datos.getEdad() + " años";
        String elMensaje = "El alumno " + Datos.getNombre() + " " + Datos.getApellido() + ", de edad " + Datos.getEdad() + " cuyo email es " + Datos.getEmail() + ", ha sido aceptado en " +  + ".";
        return elMensaje;

    }



}
/*

HACER LOS CONTROLLER LUEGO DE LOS SERVICE


/* 1- Crear un metodo que se fije si el nombre del usuario es Lio, en caso de que lo sea devuelva un
mensaje que "sea Lio" y si no que devuelva un mensaje en el que tenga el nombre realmente.

2- crear un metodo que se fije si mi apellido es Lombardi, Ricco, Alcaraz, Frutos y que me devuelva
el apellido que corresponda (hacer lo más eficientemente posible)

3- crear un metodo que me vaya diciendo todos los valores del usuario (nombre, apellido, edad y email)

4- crear un metodo en el que obtenga el nombre, apellido y edad del usuario y después esa información
me aparezca en un mensaje diciendo que fue aceptado en la universidad tecnológica nacional (UTN)

"El alumno (nombre y apellido) de edad (edad), cuyo email es (email), ha sido aceptado en (InstituciónNombre)"

5- crear un metodo que por cada nombre del usuario me devuelva un "Hola (nombre y apellido)"

USAR UN BUCLE FOR o FOREACH
 */
