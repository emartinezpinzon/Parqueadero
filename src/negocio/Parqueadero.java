package negocio;

/**
 * @author Emanuel Martínez Pinzón
 */
import java.util.ArrayList;

public class Parqueadero {
    ArrayList<Puesto> Puesto;
    private int tarifaHora;
    private int tarifaFraccion;
    private int totalRecaudado;
    
    public Parqueadero(){
        this.Puesto = new ArrayList<Puesto>();
        this.crearPuestos();
    }
    
    private void crearPuestos(){
        for(int i=0; i<4; i++)
            this.Puesto.add(new Puesto(i+1));
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES-----------------------//
    public String parquearCarro(String placa, String hora, String minuto){
        String men = "No hay puestos para parquear más carros";
        
        if(this.buscarCarro(placa) != null)
            return "El carro ya esta parqueado en un puesto";
        
        if(this.puestoVacio()!=-1){
            Carro Carro = new Carro(placa, hora, minuto);
            this.Puesto.get(this.puestoVacio()).asignarPuesto(Carro);
            this.Puesto.get(this.puestoVacio()).setEstado(false);
            return "Carro parqueado en el puesto "+this.puestoVacio();
        }
            
        return men;
    }
    
    //----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    public Carro buscarCarro(String placa){
        Carro carro = null;
        
        for(Puesto p: Puesto)
            if(p.getEstado()==false && 
                    p.getCarro().getPlaca().equalsIgnoreCase(placa))
                carro = p.getCarro();
        
        return carro;
    }
    
    public String PuestosVacios(){
        String num = "";
        
        for(Puesto p: Puesto)
            if(p.getEstado()==true)
                num += p.getNumero()+"-";
        
        return num;
    }
    
    public int puestoVacio(){
        for(Puesto p: Puesto)
            if(p.getEstado()==true)
                return (p.getNumero()-1);
        
        return -1;
    }

    public String concatenarCarros(){
        String carros = "";
        
        for(int i=0; i<this.Puesto.size();i++)
            if(this.Puesto.get(i).getEstado()==false)
                carros += this.Puesto.get(i).getCarro().getPlaca()+"-";
        
        return carros;
    }
    
    public String concatenarEstadosPuestos(){
        String estados = "";
        
        for(Puesto p: Puesto)
            estados += p.getEstado()+"-";
        
        return estados;
    }
    
    //------------------------Getter's y Setter's-----------------------------//
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
