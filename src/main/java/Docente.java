public class Docente extends Persona {

    protected String dicta_materia;
    protected String en_Carrera;

    public Docente(String nombre, String apellido, String ci, String dicta_materia,String en_Carrera) {
        super(nombre, apellido, ci);
        this.dicta_materia= dicta_materia;
        this.en_Carrera= en_Carrera;
    }

    public void setDicta_materia(String dicta_materia) {
        this.dicta_materia = dicta_materia;
    }

    public void setEn_Carrera(String en_Carrera) {
        this.en_Carrera = en_Carrera;
    }

    public String getDicta_materia() {
        return dicta_materia;
    }

    public String getEn_Carrera() {
        return en_Carrera;
    }

    public String datos(){
        String datos;
        datos = "El docente es: "+getNombre()+" "+getApellido()+"\nDicta la materia de "+getDicta_materia()+"\n"+getEn_Carrera();
        System.out.println(datos);
        return datos;
    }
}
