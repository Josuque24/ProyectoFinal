package proyecto00;
import javax.swing.JOptionPane;
public class Menu2 {
private byte respuestaMenuCompraVenta;    
    public void responderMenuCompraVenta(){
        while(respuestaMenuCompraVenta!=3){
        respuestaMenuCompraVenta=Byte.parseByte(JOptionPane.showInputDialog (null,
                                            "Desea vender o comprar bienes raices?\n"
                                            +"1) Vender \n"
                                            +"2) Comprar \n" 
                                            +"3) Salir"
                                            ));             
            switch(respuestaMenuCompraVenta){
                  case 1:{

                    break; 
                  }
                  case 2:{

                     break;
                  }
                  case 3:{

                     break;
                  }
                  default:{
                     JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                  }
            } //fin de switch
        } //fin de while   
    }//fin menuCompraVenta
} //fin responderMenuCompraVenta
