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
        this.Puesto = new ArrayList<Puesto>();
        this.Carro = new ArrayList<Carro>();
        this.crearPuestos();
    }
    
    private void crearPuestos(){
        for(int i=1; i<=4; i++)
            this.Puesto.add(new Puesto(i));
    }
    
    public String parquearCarro(String placa, String hora, String minuto){
        if(this.buscarCarro(placa) != null)
            return "El carro ya esta parqueado en un puesto";
        
        Carro Carro = new Carro(placa, hora, minuto);
        
        this.Puesto.get(this.puestoVacio()).asignarPuesto(Carro);
        this.Puesto.get(this.puestoVacio()).setEstado("Ocupado");
        
        return "Carro parqueado exitosamente";
    }
    
    public Carro buscarCarro(String placa){
        Carro carro = null;
        
        for(Carro c: Carro)
            if(c!=null && c.getPlaca().equalsIgnoreCase(placa))
                carro = c;
        
        return carro;
    }
    
    public int puestoVacio(){
        for(Puesto p: Puesto)
            if(p != null && p.getEstado().equalsIgnoreCase("Libre"))
                return p.getNumero();
        
        return 0;
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
