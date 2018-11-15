public class Licuadora extends  Electrodomestico {
    protected  int tamanio;

    public Licuadora(String marca, String modelo, String color, int peso, String garantia, int tamanio) {
        super(marca, modelo, color, peso, garantia);
        this.tamanio = tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }
}
