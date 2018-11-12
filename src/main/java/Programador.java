public class Programador extends Empleado {

    public int lineasCodigo;
    public String lenguajeDominante;


    //sobrecarga de constructores
    public Programador() {
    }

    public Programador(int lineasCodigo, String lenguajeDominante) {
        this.lineasCodigo = lineasCodigo;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador(String nombre, String apellido, String cedula, int edad, boolean casado, double salario, int lineasCodigo, String lenguajeDominante) {
        super(nombre, apellido, cedula, edad, casado, salario);
        this.lineasCodigo = lineasCodigo;
        this.lenguajeDominante = lenguajeDominante;
    }

    public void setLineasCodigo(int lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }

    public String setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
        return lenguajeDominante;
    }

    public int getLineasCodigo() {
        return lineasCodigo;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

}
