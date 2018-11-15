public abstract class Futbolista extends SeleccionFutbol {

    protected int dorsal;
    protected String demarcacion;

    public Futbolista(int dorsal, String demarcacion,int id ,String nombre, String apellido, int edad) {
        super(id ,nombre,apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void entrevista(){

    }

    @Override
    public abstract void entrenamiento();

    @Override
    public abstract void partidoFutbol();
}