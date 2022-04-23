package proyecto00;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
public class Menu1 {
private byte respuestaMenuPrincipal;  
    public void responderMenuPrincipal (){
    Rutina r=new Rutina();
    Menu2 m2=new Menu2();
    r.predefinirUsuario();
    JOptionPane.showMessageDialog(null,"El programa empieza con un usuario por defecto. \n"
            + "Por favor modifique la informacion de usuario con su informacion en el siguiente menu."
            , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        while(respuestaMenuPrincipal!=6){
        respuestaMenuPrincipal= Byte.parseByte(JOptionPane.showInputDialog (null,"Menu pricipal \n"
                +"1) Mostrar los datos de usuario almacenados. \n"
                +"2) Modifique la informacion de usuario. \n"
                +"3) Entrar en menu de compra y venta. \n"
                +"4) Aplicar por un descuento \n"
                +"5) Guardar la informacion de usuario para referirla a los colaboradores. \n"
                +"6) salir \n" ,"Menu",JOptionPane.INFORMATION_MESSAGE ));
            switch(respuestaMenuPrincipal){
                  case 1:{
                     r.mostrarUsuario();
                    break; 
                  }
                  case 2:{
                    r.modificarUsuario();
                     break;
                  }
                  case 3:{
                    m2.responderMenuCompraVenta();
                     break;
                  }
                   case 4:{
                    
                     break;
                  }
                   case 5:{
                    r.archivarUsuario();
                    JOptionPane.showMessageDialog(null,"Ya se guardo la informacion de usuario.");
                     break;
                  }
                   case 6:{
                       
                     break;  
                  }
                  default:{
                     JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                  }
            } // fin de switch
        } // fin de while
    } //fin de reponder menu principal   
}//fin clase menus


