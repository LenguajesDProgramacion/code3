import java.awt.*;

public class Lavadora extends Electrodomestico{

    protected int capacidad = 0;

    public Lavadora(String marca, String modelo, String color, int peso, String garantia, int capacidad) {
        super(marca, modelo, color, peso, garantia);
        this.capacidad = capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public int get_capacidadMax(int capacidad){
        if(capacidad>100){
            System.out.println("La capacidad maxima es 100 Kg");
        }else{
            System.out.print("La capacidad es correcta");
        }
        return capacidad;
    }
}