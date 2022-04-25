package proyecto00;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
public class Menu1 {
private byte respuestaMenuPrincipal;
private String usuarioString;
    public void responderMenuPrincipal (){
    Rutina r=new Rutina();
    Menu2 m2=new Menu2();
    JOptionPane.showMessageDialog(null,"A continuacion el programa la pedira que ingrese su informacion personal. \n                       "
            + "Despues de eso podra ingresar al menu principal.\n"
            + "La informacion que provea aqui sera referida a un asesor de bienes raises. \n"
            + "El acesor se pondra en contacto con usted en las proximas 48 horas."    
            , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    r.predefinirUsuario();
    r.modificarUsuario();
    r.mostrarUsuario();
    r.archivarUsuario();        
 //JOptionPane.showMessageDialog(null,"Se guardo la informacion");
        
        while(respuestaMenuPrincipal!=4){
        respuestaMenuPrincipal= Byte.parseByte(JOptionPane.showInputDialog (null,"Menu pricipal \n"
                +"1) Mostrar los datos de usuario almacenados. \n"
                +"2) Modifique la informacion de usuario. \n"
                +"3) Entrar al menu de Compra y Venta. \n"                                
                +"4) salir \n" ,"Menu",JOptionPane.INFORMATION_MESSAGE ));
            switch(respuestaMenuPrincipal){
                  case 1:{
                     r.mostrarUsuario();
                    break; 
                  }
                  case 2:{
                    r.modificarUsuario();
                    r.archivarUsuario();
                    JOptionPane.showMessageDialog(null,"Se guardo la informacion de usuario,");
                     break;
                  }
                  case 3:{
                    m2.responderMenuCompraVenta();
                     break;
                  }
                   case 4:{
                    
                     break;
                  }                   
                  default:{
                     JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                  }
            } // fin de switch
        } // fin de while
    } //fin de reponder menu principal   
}//fin clase menus


