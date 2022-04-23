package proyecto00;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing. JOptionPane;
public class Rutina {
private Persona usuario []=new Persona [1];    
     
public void predefinirUsuario (){
  usuario[0]=new Persona ("Sin Usuario","Sin correo electronico",00000000);     
}//fin de ingresarDatosUsuario

public void mostrarUsuario(){
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
     
public void mostrarFinal(){
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\usuario.txt";
            String contenido = (" Nombre: " + usuario[0].getNombre()
                                +"\n Email: " + usuario[0].getEmail()
                                +"\n Numero de Telefono: " + usuario[0].getNumeroTelefono());
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // fin de mostrarFinal


} // fin de rutina 
