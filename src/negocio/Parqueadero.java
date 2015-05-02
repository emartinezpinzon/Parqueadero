package negocio;

/**
 * @author Emanuel Martínez Pinzón
 */

import java.util.ArrayList;

public class Parqueadero {
    
    ArrayList<Puesto> Puesto;
    ArrayList<Carro> Carro;
    private int tarifaHora;
    private int tarifaFraccion;
    private int totalRecaudado;
    
    
    public Parqueadero(){
        this.tarifaHora = 1000;
        this.tarifaFraccion = 500;
    }
    
    private void crearPuestos(){
        for(int i=0; i<4; i++)
            this.Puesto.add(new Puesto(i+1));
    }

    public int getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public int getTarifaFraccion() {
        return tarifaFraccion;
    }

    public void setTarifaFraccion(int tarifaFraccion) {
        this.tarifaFraccion = tarifaFraccion;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(int totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }
}
