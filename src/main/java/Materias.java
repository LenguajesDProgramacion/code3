public class Materias {

    public Materias(String[] materia) {
        this.materia = materia;
    }

    public String [] materia;


    public Materias() {
        this.materias = materias;
        this.materias[0]="Lenguajes de Programacion";
        this.materias[1]="Introduccion a Programacion";
        this.materias[2]="Estructura de datos I";
        this.materias[3]="Programacion Estrucuturada";
        this.materias[4]="Auditoria de Sistemas";
    }

    public String[] getMaterias(String[] materias) {
        return materias ;
    }
}
