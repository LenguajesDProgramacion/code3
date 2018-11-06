public class Persona{

    public String nombre;
    public String apellido;
    public String ci;
    public int edad;

    public Persona(String nombre, String apellido, String ci, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }
}