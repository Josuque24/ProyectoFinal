package proyecto00;
import javax.swing. JOptionPane;
public class Rutina {
private Persona usuario []=new Persona [1];    
    
public void predefinirUsuario (){
  usuario[0]=new Persona ("UsuarioPorDefecto","correo@email.com",555555);     
}//fin de ingresarDatosUsuario

public void motrarUsuario(){
    int x=0;
  JOptionPane.showMessageDialog(null," Nombre: " + usuario[x].getNombre()
                                +"\n Email: " + usuario[x].getEmail()
                                +"\n Numero de Telefono: " + usuario[x].getNumeroTelefono());     
}
  
    
public void ingresarDatosPropiedadConstruida () {
    
} // fin de   ingresarDatosPropiedadConstruida


} // fin de rutina 
