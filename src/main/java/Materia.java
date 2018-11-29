import java.util.ArrayList;
import java.util.List;

public class Materia {

    public String Nombre;
    public String key ="";
    public int nota;
    public List<Materia> materia;

    public Materia(String nombre, String key, int nota) {
        Nombre = nombre;
        this.key = key;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void addMateria(Materia materia){
        this.materia.add(materia);
    }

    public String getNombre() {
        return Nombre;
    }

    public String getKey() {
        return key;
    }

    public List<Materia> getMateria() {
        return materia;
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
                System.out.println("Estas aprobado, tu nota es:"+" "+materia.getNota());
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
