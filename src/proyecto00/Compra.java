package proyecto00;
import javax.swing.JOptionPane;
public class Compra {
    private Propiedad comprarPropiedad []=new Propiedad [1];
    
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
        comprarPropiedad[0]=pro; 
    } // fin de   ingresarDatosPropiedadConstruida
    
   public void mostrarDatosPropiedadConstruida () {
       String a,b,c,d,e;
       if(venderPropiedad[0].getMedidasPatio()>0){
        a="La propiedad tiene patio de "+venderPropiedad[0].getMedidasPatio()+ " m²" ;
       }else{
        a="La propiedad no tiene patio.";   
       }
       if(venderPropiedad[0].getComedor()==1){b= "Si";}else{b= "No";}
       if(venderPropiedad[0].getSala()==1){c="Si";}else{c="No";}
       if(venderPropiedad[0].getGaraje()==1){d="Si";}else{d="No";}
       if(venderPropiedad[0].getCuartoLavado()==1){e="Si";}else{e="No";}
       
       String s="El valor de la propiedad es: "+ venderPropiedad[0].getValorPropiedad()+"\n"
               +"La propiedad tiene "+venderPropiedad[0].getMedidasPropiedad() + " m² \n" 
               +"La propiedad tiene "+venderPropiedad[0].getCantHabitaciones()+" habotaciones."
               + a + "\n"
               +"La propiedad tiene "+venderPropiedad[0].getCantBaños()+" \n"
               +"la propiedad tiene comedor: "+ b +"\n"
               +"La propiedad tiene sala: "+ c + "\n"
               +"La propiedad tiene garaje: "+ d +"\n"
               +"La cantidad tiene cuarto de lavado: "+ e +"\n";
       JOptionPane.showMessageDialog(null,s);
   } 
   
   
   
    
    public void ingresarDatosPropiedadBaldia (){
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresar el valor de la propiedad:")));
        pro.setMedidasPropiedad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresar la cantidad de metros cuadrados que tiene la propiedad:")));
    } // fin de ingresarDatosPropiedadBaldia
               
    
}
