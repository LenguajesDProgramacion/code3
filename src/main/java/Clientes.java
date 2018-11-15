public class Clientes {

    protected String nombre;
    protected String claveCliente;
    protected int numCompras;
    protected int total = 5000;
    protected int descuento;

    public Clientes(String nombre, String claveCliente, int numCompras) {
        this.nombre = nombre;
        this.claveCliente = claveCliente;
        this.numCompras = numCompras;
    }

    Descuentos descuentos = new Descuentos();

    public int totalPagarA(String claveCliente){
        if (claveCliente == Descuentos.Grupo0){
        }if(numCompras>=10000){
            descuento = (int) (total* (10)/100);
        }else{
            System.out.print("Necesita tener mas de 10.000 compras para el descuento");
        }
        return descuento;
    }

    public int totalPagarB(String claveCliente){
        if (claveCliente == Descuentos.Grupo1){
        }if(numCompras>=10000){
            descuento = (int) (total * (5)/100);
        }else{
            System.out.print("Necesita tener mas de 10.000 compras para el descuento");
        }
        return descuento;
    }

    public int totalPagarC(String claveCliente){
        if (claveCliente == Descuentos.Grupo0){
        }if(numCompras>=10000){
            descuento = (int) (total * (2)/100);
        }else{
            System.out.print("Necesita tener mas de 10.000 compras para el descuento");
        }
        return descuento;
    }

    public String getClaveCliente() {
        return claveCliente;
    }

    public String setClaveCliente(String claveCliente) {
        this.claveCliente = claveCliente;
        return claveCliente;
    }
}
