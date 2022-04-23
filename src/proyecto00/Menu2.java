package proyecto00;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
                                            +"3) Salir")); 
            if(respuestaMenuCompraVenta==1){
                
                Venta v=new Venta ();
                //while(respuestaMenuVenta !=3){
                    respuestaMenuVenta = Byte.parseByte(JOptionPane.showInputDialog (null,""
                        + "¿Que desea? \n" 
                        + "1) Vender un lote baldío. \n"
                        + "2) Vender un lote con un edificio ya construido. \n"
                        + "3) Salir de este menu. \n"));
                    if(respuestaMenuVenta==1){
                        v.ingresarDatosPropiedadBaldia();
                        v.mostrarDatosPropiedadBaldia();
                        v.archivarDatosPropiedadBaldia();
                    }if(respuestaMenuVenta==2){
                        v.ingresarDatosPropiedadConstruida();
                        v.mostrarDatosPropiedadConstruida();
                        v.archivarDatosPropiedadConstruida();
                    }else{
                        JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                    }//fin de if
                //} // fin de while
                
            }if(respuestaMenuCompraVenta==2){
                
                //while(respuestaMenuCompra !=3){
                    respuestaMenuCompra = Byte.parseByte(JOptionPane.showInputDialog (null,""
                        + "¿Que desea? \n" 
                        + "1) Comprar un lote baldío. \n"
                        + "2) Comprar un lote con un edificio ya construido. \n"
                        + "3) Salir de este menu."    ));
                    if(respuestaMenuCompra==1){

                    }if(respuestaMenuCompra==2){

                    }else{
                        JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
                    }//fin de if                 
                //} // fin de while
                
            }else{
                JOptionPane.showMessageDialog(null,"Escribio un numero que no es parte del menu.");
            }
        }  
    }  
} 