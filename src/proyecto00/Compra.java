package proyecto00;
import javax.swing.JOptionPane;
public class Compra {
    private Propiedad venderPropiedad []=new Propiedad [1];
    
    public void ingresarDatosPropiedadConstruida () {
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresar el valor de la propiedad:")));
        pro.setMedidasPropiedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresar la cantidad de metros cuadrados que tiene la propiedad:")));
        pro.setCantHabitaciones(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de habitaciones que tiene la propiedad:")));
        pro.setMedidasPatio(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de metros cuadrados que tiene el patio: \n"
                +"Si no tiene patio escriba cero","0")));
        pro.setCantBaños(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de baños que hay en la propiedad:")));
        pro.setComedor(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con un comedor?\"\n" +
                "+\"0)No 1) Si ")));
        pro.setSala(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con una sala?\"\n" +
                "+\"0)No 1) Si ")));
        pro.setGaraje(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con un garaje?\"\n" +
                "+\"0)No 1) Si ")));
        pro.setCuartoLavado(Byte.parseByte(JOptionPane.showInputDialog(null,
                "")));
        venderPropiedad[0]=pro; 
        
    } // fin de   ingresarDatosPropiedadConstruida
    
    public void ingresarDatosPropiedadBaldia (){
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresar el valor de la propiedad:")));
        pro.setMedidasPropiedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresar la cantidad de metros cuadrados que tiene la propiedad:")));
    } // fin de ingresarDatosPropiedadBaldia
               
    
}
