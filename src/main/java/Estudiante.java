import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    protected String carrera;
    Materia materia;
    Docente docente;

    public Estudiante(String nombre, String apellido, String ci, String carrera, List<Materia>materia) {
        super(nombre, apellido, ci);
        this.carrera=carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public String verDatos(){
        String datos;
        datos = getNombre()+"\n"+getApellido()+"\n"+getCarrera();//+"\n"+materia.getKey()+"\n"+docente.getNombre()+"\n"+materia.getNota();
        System.out.println(datos);
        return datos;
    }
}
