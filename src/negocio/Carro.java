package negocio;

/**
 * @author Emanuel Martínez Pinzón
 */

public class Carro {
    private String placa;
    private String hora;
    private String minuto;

    public Carro(String placa, String hora, String minuto){
        this.placa = placa;
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
}
