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
            this.Puesto.get(this.puestoVacio()).setEstado("Ocupado");
            return "Carro parqueado con exito";
        }
            
        return men;
    }
    
    public String retirarCarro(String placa, String hora, String minutos){
        String mensaje = "Carro retirado con exito";
        
//        for(Puesto p:Puesto)
//            if(p.getCarro().getPlaca().equalsIgnoreCase(placa)){
//                p.setEstado("Libre");
//                this.Puesto.remove(p);
//            }
        
        for(int i=0; i<this.Puesto.size(); i++){
            if(this.Puesto.get(i)!=null && 
                    this.Puesto.get(i).getCarro().getPlaca().equalsIgnoreCase(placa))
                this.Puesto.remove(i);
                this.Puesto.get(i).setEstado("Libre");
        }                
        
        return mensaje;
    }
    
    //----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    public Carro buscarCarro(String placa){
        Carro carro = null;
        
        for(Puesto p: Puesto)
            if(p.getEstado().equalsIgnoreCase("Ocupado") && 
                    p.getCarro().getPlaca().equalsIgnoreCase(placa))
                carro = p.getCarro();
        
        return carro;
    }
    
    public int puestoVacio(){
        for(Puesto p: Puesto)
            if(p.getEstado().equalsIgnoreCase("Libre"))
                return (p.getNumero()-1);
        
        return -1;
    }
    
    public int calcularPrecio(String placa, String hora, Carro Carro){
        int costo = 0;
        return costo;
    }

    public String concatenarPlacasCarros(){
        String carros = "";
        
        for(int i=0; i<this.Puesto.size();i++)
            if(this.Puesto.get(i).getEstado().equalsIgnoreCase("Ocupado"))
                carros += this.Puesto.get(i).getCarro().getPlaca()+"-";
        
        return carros;
    }
    
    public String concatenarInfoCarros(){
        String info = "";
        
        for(Puesto p: Puesto)
            if(p.getEstado().equalsIgnoreCase("Ocupado"))
                info += p.toString()+"\n\n";
        
        return info;
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
