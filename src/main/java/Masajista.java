public abstract class Masajista extends SeleccionFutbol implements MasajistaIn {

    protected String titulacion;
    protected String aniosExperiencia;


    public Masajista(String titulacion, String aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public void darMasaje(boolean masaje){

        masaje= SeleccionFutbol.getInstanceSF().jugar_partido == true;

        if(masaje == true){
            System.out.print("Dar Masajes");
        }else{
            System.out.print("No dar masajes");
        }
    }

    @Override
    public abstract void entrenamiento();

    @Override
    public abstract void partidoFutbol();

}
