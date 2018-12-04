public class Libro {

    protected String nombreLibro;
    protected String Autor;
    protected int numCopias;
    protected int numLib_Prestado;

    public Libro(String nombreLibro, String autor, int numCopias, int numLib_Prestado) {
        this.nombreLibro = nombreLibro;
        Autor = autor;
        this.numCopias = numCopias;
        this.numLib_Prestado = numLib_Prestado;
    }

    public Libro() {        //Sobrecarga de constructores
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public int getNumLib_Prestado() {
        return numLib_Prestado;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public void setNumLib_Prestado(int numLib_Prestado) {
        this.numLib_Prestado = numLib_Prestado;
    }

    public int prestamo_Libro(int numCopias, int numLib_Prestado){
        if(numCopias >= numLib_Prestado){
            System.out.println("Existen libros para prestar");

        }else {
            System.out.println("No existen libros para el prestamo");
        }
        numCopias =-1;
        numLib_Prestado =+1;
        return numLib_Prestado;

    }

    public int devolucion_Libro(int numCopias, int numLib_Prestado){
        numCopias = 10;
        numLib_Prestado =0;
        numLib_Prestado =-1;
        numCopias =+1;

        if(numLib_Prestado >= numCopias){
            System.out.println("Se necesita devolucion de libros");
        }
        return numLib_Prestado;
    }
}
