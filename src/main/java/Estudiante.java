public class Estudiante extends Persona{

    public int nota;
    public String [] materia =  new String[0];


    public Estudiante(String[] materia, int nota,String nombre,String apellido,String ci, int edad) {
        super(nombre,apellido,ci,edad);
        this.nota = nota;
    }

    public void setMateria(String[] materia) {
        this.materia = materia;
    }

    public String[] getMateria() {
        String[] materias = new String[0];
        materias[0]="Lenguajes de Programacion";
        materias[1]="Introduccion a Programacion";
        materias[2]="Estructura de datos I";
        materias[3]="Programacion Estrucuturada";
        materias[4]="Auditoria de Sistemas";
        return materia;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public int Calificacion(){
        if(nota >= 51){
            System.out.println("Estas aprobado");
        }else
        if(nota < 51)
        {
            System.out.println("Estas reprobado");
        }
        return 0;
    }
}