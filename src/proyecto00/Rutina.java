package proyecto00;
import javax.swing. JOptionPane;
public class Rutina {
private Persona usuario []=new Persona [1];    
    
public void predefinirUsuario (){
  usuario[0]=new Persona ("Sin Usuario","Sin correo electronico",00000000);     
}//fin de ingresarDatosUsuario

public void mostrarUsuario(){
    //int x=0;
  JOptionPane.showMessageDialog(null," Nombre: " + usuario[0].getNombre()
                                +"\n Email: " + usuario[0].getEmail()
                                +"\n Numero de Telefono: " + usuario[0].getNumeroTelefono());     
}

public void modificarUsuario (){
    Persona p=new Persona(); 
    p.setNombre( JOptionPane.showInputDialog(null,"Modificar el nombre de Usuario:"));
    p.setEmail(JOptionPane.showInputDialog(null,"Modificar el email del Usuario:"));
    p.setNumeroTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Modificar el numero de telefono del Usuario:")));
    usuario[0]=p;
} //fin de modificarUsuario
     
public void ingresarDatosPropiedadConstruida () {
    
} // fin de   ingresarDatosPropiedadConstruida


} // fin de rutina 
