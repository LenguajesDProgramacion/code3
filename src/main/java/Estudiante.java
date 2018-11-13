import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    public List<Materia> materia;


    public Estudiante(String nombre, String apellido, String ci, int edad) {
        super(nombre, apellido, ci, edad);
        this.materia = new ArrayList<>();
    }

    public void addMateria(Materia materia) {
        this.materia.add(materia);
    }

    public String getMateria(String key, List<Materia> materias) {
        String detalle = "";
        for (Materia materia : materias) {
            if (materia.getKey().equals(key)) {
                detalle = materia.getKey() + "\n" + materia.getNombre() + "\n" + materia.getNota();
                break;
            }
        }
        return detalle;
    }

    public int notaMinima(String key, int nota, List<Materia> materias) {
        for (Materia materia : materias) {
            if (nota <= 51) {
                System.out.println("Estas reprobado");
            } else {
                System.out.println("Estas aprobado");
            }
        }
        return nota;
    }

    public int notaMinima_all() {
        int nota_minima = 50;
        for (Materia materia : this.materia) {
            if (materia.getNota() <= nota_minima) {
                nota_minima = materia.getNota();
            }
        }
        return nota_minima;
    }
}