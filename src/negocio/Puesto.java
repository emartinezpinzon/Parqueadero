package negocio;

/**
 * @author Emanuel Martínez Pinzón
 */

public class Puesto {
    private int numero;
    private boolean estado;
    private Carro carro;
    
    public Puesto(int numero){
        this.numero = numero;
        this.estado = true;
    }
    
    public void asignarPuesto(Carro carro){
        this.carro = carro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public String toString(){
        return "Puesto: "+this.getNumero()
            +"\nEstado: "+this.getEstado()
            +"\nPlaca del carro: "+this.getCarro().getPlaca()
            +"\nHora: "+this.getCarro().getHora()+":"+this.getCarro().getMinuto();
    }
}
