public class SeleccionFutbol{

        protected  int id;
        protected  String nombre;
        protected  String apellido;
        protected  int edad;
        protected boolean jugar_partido;
        protected boolean jugar_partido_exterior;
        protected boolean concentracion;
        private static SeleccionFutbol seleccionFutbol;


        //Sobrecarga de constructores
        public SeleccionFutbol() {
        }

        public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
        }

        public boolean MsgEntrenamiento(boolean Msg){
                if(Msg==true){
                System.out.print("Ah entrenar equipo");
                }
                return Msg;
        }

        public boolean viajar(boolean jugar_partido_exterior){

                boolean viajar = false;

                if(jugar_partido_exterior == true){
                         System.out.print("El equipo viaja"+"\n");
                }else{
                        System.out.print("El equipo juega de local, no viaja"+"\n");
                }
        return jugar_partido_exterior;
        }

        public boolean concentrarse(boolean jugar_partido){
                if(jugar_partido == true) {
                        System.out.print("Hay concentracion 07:00 pm"+"\n");
                }else{
                        System.out.print("no hay concentración"+"\n");
                }
                return jugar_partido;
        }

        //Singlenton
        public static SeleccionFutbol getInstanceSF(){
                if(seleccionFutbol == null){
                        seleccionFutbol = new SeleccionFutbol();
                }
                return seleccionFutbol;
        }

        public void partidoFutbol() {
        }

        public void entrenamiento() {
        }
}