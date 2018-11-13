import java.util.List;

public class Materia {

    public String Nombre;
    public String key ="";
    public int nota;
    public List<Materia> materias;

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public Materia(String nombre, String key, int nota) {
        Nombre = nombre;
        this.key = key;
        this.nota = nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getKey() {
        return key;
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}
