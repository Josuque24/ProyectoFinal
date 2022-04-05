package proyecto00;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        provincias p=new provincias();
        Descuento3 d=new Descuento3();
        p.select();
        d.referirNombres();
        d.mostrarNombresReferidos();
        
    }    
}
