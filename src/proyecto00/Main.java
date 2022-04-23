package proyecto00;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Menu1 m=new Menu1(); 
        JOptionPane.showMessageDialog(null,"El programa empieza con un usuario por defecto. \n"
            + "Por favor modifique la informacion de usuario con su informacion en el siguiente menu."
            , "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        m.responderMenuPrincipal();                
    }  
}
