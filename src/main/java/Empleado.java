public class Empleado{

    public String nombre;
    public String apellido;
    public String cedula;
    public int edad;
    public boolean casado;
    public double salario;

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    //Sobrecarga de constructures 2 constructores
    public Empleado() {
    }

    public Empleado(String nombre,String apellido ,String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public int Clasificacion(int edad){
        if(edad<=21){
            System.out.println("Principiante");

        }if(edad >=22 && edad <=35){
            System.out.println("Intermedio");

        }if(edad>35){
            System.out.println("Senior");
        }
        return edad;
    }

    public String imprimirDatos(String nombre){
        Empleado empleado = new Empleado();
        String detalle = empleado.getNombre()+"\n"+empleado.getApellido()+"\n"+empleado.getCedula()+"\n"+empleado.isCasado()+"\n"+empleado.getSalario() +"\n"+empleado.getEdad();
        return detalle;
    }

    public double aumentoSalario(double Salario, int porcetaje){
        salario = 0;
        int porcentaje= 0;
        double salario_aumento =+ (salario*porcentaje)/100;
        return salario_aumento;
    }
}