package proyecto00;
import javax.swing.JOptionPane;
public class Propiedad {
    private int valorPropiedad;    
    private int medidasPropiedad;
    private byte cantHabitaciones;
    private int medidasPatio;
    private byte cantBaños;
    private byte comedor;
    private byte sala;
    private byte garaje;
    private byte cuartoLavado;

    public Propiedad (){
    this.valorPropiedad=0;    
    this.medidasPropiedad=0;
    this.cantHabitaciones=0;
    this.medidasPatio=0;
    this.cantBaños=0;
    this.comedor=0;
    this.sala=0;
    this.garaje=0;
    this.cuartoLavado=0;
    }    
    
    


    public int getValorPropiedad() {
        return valorPropiedad;
    }

    public void setValorPropiedad(int valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    public int getMedidasPropiedad() {
        return medidasPropiedad;
    }

    public void setMedidasPropiedad(int medidasPropiedad) {
        this.medidasPropiedad = medidasPropiedad;
    }

    public byte getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(byte cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getMedidasPatio() {
        return medidasPatio;
    }

    public void setMedidasPatio(int medidasPatio) {
        this.medidasPatio = medidasPatio;
    }

    public byte getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(byte cantBaños) {
        this.cantBaños = cantBaños;
    }

    public byte getComedor() {
        return comedor;
    }

    public void setComedor(byte comedor) {
        this.comedor = comedor;
    }

    public byte getSala() {
        return sala;
    }

    public void setSala(byte sala) {
        this.sala = sala;
    }

    public byte getGaraje() {
        return garaje;
    }

    public void setGaraje(byte garaje) {
        this.garaje = garaje;
    }

    public byte getCuartoLavado() {
        return cuartoLavado;
    }

    public void setCuartoLavado(byte cuartoLavado) {
        this.cuartoLavado = cuartoLavado;
    }
    



}
