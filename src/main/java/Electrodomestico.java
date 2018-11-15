public class Electrodomestico{

    protected String Marca;
    protected String Modelo;
    protected String color;
    protected int peso;
    protected String garantia;

    public Electrodomestico(String marca, String modelo, String color, int peso, String garantia) {
        this.garantia= garantia;
        Marca = marca;
        Modelo = modelo;
        this.color = color;
        this.peso = peso;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPeso() {
        return peso;
    }

    public int get_capacidadMax(int capacidad){
        if(capacidad>100){
            System.out.println("La capacidad maxima es 100 Kg");
        }else{
            System.out.print("La capacidad es correcta");
        }
        return capacidad;
    }
}