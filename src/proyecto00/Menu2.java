package proyecto00;
import javax.swing.JOptionPane;
public class Menu2 {
    private byte respuestaMenuCompraVenta; 
    private byte respuestaMenuCompra;
    private byte respuestaMenuVenta;
    
    
    public void responderMenuCompraVenta(){
        while(respuestaMenuCompraVenta!=3){
        respuestaMenuCompraVenta=Byte.parseByte(JOptionPane.showInputDialog (null,
                                            "Desea vender o comprar bienes raices?\n"
                                            +"1) Vender \n"
                                            +"2) Comprar \n" 
                                            +"3) Salir"
                                            )); 
            if(respuestaMenuCompraVenta==1){
                
                Venta v=new Venta ();
                while(respuestaMenuVenta !=3){
                    respuestaMenuVenta = Byte.parseByte(JOptionPane.showInputDialog (null,""
                        + "¿Que desea?" 
                        + "1) Vender un lote baldío."
                        + "2) Vender un lote con un edificio ya construido."
                        + "3) Salir de este menu."    ));
                    if(respuestaMenuVenta==1){
                        v.ingresarDatosPropiedadBaldia();
                    }if(respuestaMenuVenta==2){
                        v.ingresarDatosPropiedadConstruida();
                    }else{
                        JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                    }//fin de if
                } // fin de while
                
            }if(respuestaMenuCompraVenta==2){
                
                while(respuestaMenuCompra !=3){
                    respuestaMenuCompra = Byte.parseByte(JOptionPane.showInputDialog (null,""
                        + "¿Que desea?" 
                        + "1) Comprar un lote baldío."
                        + "2) Comprar un lote con un edificio ya construido."
                        + "3) Salir de este menu."    ));
                    if(respuestaMenuCompra==1){

                    }if(respuestaMenuCompra==2){

                    }else{
                        JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                    }//fin de if                 
                } // fin de while
                
            }else{
                JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
            }
        } //fin de while   
    }//fin menuCompraVenta   
} //fin responderMenuCompraVenta


/* switch(respuestaMenuCompraVenta){
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
            } //fin de switch */