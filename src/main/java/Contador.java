public class Contador {
    public int numero_incremento = 0;
    public int numero_decremento = 0;
    public int contador;

    public Contador(int numero_incremento, int numero_decremento) {
        this.numero_incremento = numero_incremento;
        this.numero_decremento = numero_decremento;
    }

    public void setNumero_incremento(int numero_incremento) {
        this.numero_incremento = numero_incremento;
    }

    public void setNumero_decremento(int numero_decremento) {
        this.numero_decremento = numero_decremento;
    }

    public int getNumero_incremento() {
        return numero_incremento;
    }

    public int getNumero_decremento() {
        return numero_decremento;
    }

    public int incrementoContador( int numero_incremento){
        contador = 0;
        contador += numero_incremento;
        return contador;
    }

    public int decrementoContador(int numero_decremento){
        contador = 0;
        contador -= numero_decremento;
        return contador;
    }
}