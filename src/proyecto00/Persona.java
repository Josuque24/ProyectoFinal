package proyecto00;
import javax.swing.JOptionPane;
public class Persona {
private String nombre;
private String email;
private int numeroTelefono;

    public Persona() {
        this.nombre = "";
        this.email = "";
        this.numeroTelefono = 0;
    }
    
    public Persona(String nombre, String email,int numeroTelefono ) {
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
