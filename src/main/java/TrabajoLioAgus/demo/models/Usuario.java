package TrabajoLioAgus.demo.models;


import java.util.Date;

public class Usuario {
    private String nombre = "Agustin";
    private String apellido = "Ricco";
    private Integer edad = 22;
    private String email = "agustinricco34@mail.com";
    private Date fechaNacimiento ;


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

}
