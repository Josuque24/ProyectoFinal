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
        while(respuestaMenuPrincipal!=4){
        respuestaMenuPrincipal= Byte.parseByte(JOptionPane.showInputDialog (null,"Menu pricipal \n"
                +"1) Mostrar los datos de usuario almacenados. \n"
                +"2) Modifique la informacion de usuario. \n"
                +"3) Entrar en menu de compra y venta. \n"                                
                +"4) salir \n" ,"Menu",JOptionPane.INFORMATION_MESSAGE ));
            switch(respuestaMenuPrincipal){
                  case 1:{
                     r.mostrarUsuario();
                    break; 
                  }
                  case 2:{
                    r.modificarUsuario();
                    r.archivarUsuario();
                    JOptionPane.showMessageDialog(null,"Se guardo la informacion de usuario,"+
                            " esta se enviara a nuestros colaboradores para que ellos se pongan en contacto con usted. \n"
                            + "La informacion que usted disponga mas adelante tambien sera referida a ellos."
                            );
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


