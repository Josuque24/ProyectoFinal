package proyecto00;
import javax.swing.JOptionPane;
public class Menu3 {
    private byte respuestaMenuCompra;
    private byte respuestaMenuVenta;
    
    public void responderMenuCompra(){
        
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
    }// fin clase answerMenuCompra
    
    public void responderMenuVenta(){
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
    }// fin clase answerMenuVenta
} //fin de menu3
