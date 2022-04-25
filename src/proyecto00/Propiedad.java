package proyecto00;
import javax.swing.JOptionPane;
public class Propiedad {
    private double valorPropiedad;    
    private double medidasPropiedad;
    private byte cantHabitaciones;
    private double medidasPatio;
    private byte cantBaños;
    private byte comedor;
    private byte sala;
    private byte garaje;
    private byte cuartoLavado;
    private String direccion;
    private String anotaciones;

    public Propiedad (){
    this.valorPropiedad=0.0;    
    this.medidasPropiedad=0.0;
    this.cantHabitaciones=0;
    this.medidasPatio=0;
    this.cantBaños=0;
    this.comedor=0;
    this.sala=0;
    this.garaje=0;
    this.cuartoLavado=0;
    this.direccion= " ";
    this.anotaciones= " ";
    }    
    
    


    public double getValorPropiedad() {
        return valorPropiedad;
    }

    public void setValorPropiedad(double valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    public double getMedidasPropiedad() {
        return medidasPropiedad;
    }

    public void setMedidasPropiedad(double medidasPropiedad) {
        this.medidasPropiedad = medidasPropiedad;
    }

    public byte getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(byte cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public double getMedidasPatio() {
        return medidasPatio;
    }

    public void setMedidasPatio(double medidasPatio) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
}
