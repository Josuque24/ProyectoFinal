package proyecto00;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Menu1 m=new Menu1(); 
        JOptionPane.showMessageDialog(null,"A continuacion el programa la pedira que ingrese su informacion personal. \n                       "
            + "Despues de eso podra ingresar al menu principal.\n"
            + "La informacion que provea aqui sera referida a un asesor de bienes raises. \n"
            + "El acesor se pondra en contacto con usted en las proximas 48 horas."    
            , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        m.responderMenuPrincipal();                
    }  
}
