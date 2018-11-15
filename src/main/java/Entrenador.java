public abstract class Entrenador extends SeleccionFutbol {

    protected int idFederacion;

    public Entrenador(int idFederacion, String nombre, String apellido, int edad) {
        super(idFederacion, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    //Instanciacion del singleton
    SeleccionFutbol seleccionFutbol = SeleccionFutbol.getInstanceSF();

    //Ya que tengo una clase abstracta y en la logica el entrenador planifica
    // el entrenamiento con metodos es de la clasePadre seleccionFutbol y al no poder instanciarlo
    //recurro al uso del singlentos.


    public void planificarEntrenamiento(boolean juegaPartido ,boolean jpe){

        juegaPartido= false;
        jpe=false;

        if(seleccionFutbol.jugar_partido && seleccionFutbol.jugar_partido_exterior){
            seleccionFutbol.MsgEntrenamiento(true);
        }else{
            System.out.print("No hay entrenamiento");
        }
    }

    @Override
    public void partidoFutbol() {

    }

    @Override
    public void entrenamiento() {

    }
}
