package negocio;

/**
 * @author Emanuel Martínez Pinzón
 */

public class Puesto {
    
    private int numero;
    private String estado;
    private Carro carro;
    
    public Puesto(int numero){
        this.numero = numero;
        this.estado = "Libre";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public String toString(){
        return "";
    }
}
