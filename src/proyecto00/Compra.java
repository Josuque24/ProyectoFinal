package proyecto00;
import java.io.BufferedWriter;
import java.io.*;
import javax.swing.JOptionPane;
public class Compra {
    private Propiedad comprarPropiedad []=new Propiedad [1];
    private String s,q;
    
   public void ingresarDatosPropiedadConstruida () {
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de dinero que esta dispuesto a invertir en la propiedad:")));
        pro.setMedidasPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de metros cuadrados que desea que posea la propiedad:")));
        pro.setCantHabitaciones(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de habitaciones que debe tener la propiedad:")));
        pro.setMedidasPatio(Double.parseDouble(JOptionPane.showInputDialog(null,
                "La propiedad debe tener patio? \n"
                +"0) No \n"+" 1) Si ")));
        pro.setCantBaños(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de baños que desea en la propiedad:")));
        pro.setComedor(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con un comedor?\"\n" +
                "0) No \n"+" 1) Si ")));
        pro.setSala(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con una sala?\"\n" +
                "0) No \n"+" 1) Si ")));
        pro.setGaraje(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con un garaje?\"\n" +
                "0) No \n"+" 1) Si ")));
        pro.setCuartoLavado(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Desea una propiedad con uncuarto de lavado? \n"
                +"0) No \n"+" 1) Si ")));
        comprarPropiedad[0]=pro; 
    } // fin de   ingresarDatosPropiedadConstruida
    
   public void mostrarDatosPropiedadConstruida () {
       String a,b,c,d,e;
       if(comprarPropiedad[0].getMedidasPatio()==1){a="Si";}else{a="No";}
       if(comprarPropiedad[0].getComedor()==1){b= "Si";}else{b= "No";}
       if(comprarPropiedad[0].getSala()==1){c="Si";}else{c="No";}
       if(comprarPropiedad[0].getGaraje()==1){d="Si";}else{d="No";}
       if(comprarPropiedad[0].getCuartoLavado()==1){e="Si";}else{e="No";}
       
       s="La cantidad de dinero dispuesto a invertirse en la compra es: "+ comprarPropiedad[0].getValorPropiedad()+" colones. \n"
               +"La propiedad debe tener "+comprarPropiedad[0].getMedidasPropiedad() + " m² aproximadamente. \n" 
               +"La propiedad debe tener "+comprarPropiedad[0].getCantHabitaciones()+" habitaciones."
               +"La propiedad debe tener  patio: "+ a + "\n"
               +"La propiedad debe tener "+comprarPropiedad[0].getCantBaños()+" \n"
               +"La propiedad debe tener comedor: "+ b +"\n"
               +"La propiedad debe tener sala: "+ c + "\n"
               +"La propiedad debe tener garaje: "+ d +"\n"
               +"La cantidad debe tener cuarto de lavado: "+ e +"\n";
       JOptionPane.showMessageDialog(null,s);
   } 
   
   public void archivarDatosPropiedadConstruida(){
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\comprarPropiedadConstruida.txt";
            String contenido = (s);
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
   
    public void ingresarDatosPropiedadBaldia (){
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de dinero que esta dispuesto a invertir en la propiedad:")));
        pro.setMedidasPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de metros cuadrados que desea que posea la propiedad:")));
        comprarPropiedad[0]=pro;
    } // fin de ingresarDatosPropiedadBaldia
               
    public void mostrarDatosPropiedadBaldia () {       
        q="La cantidad de dinero dispuesto a invertirse en la compra es: "+ comprarPropiedad[0].getValorPropiedad()+" colones. \n"
        +"La propiedad debe tener "+comprarPropiedad[0].getMedidasPropiedad() + " m² aproximadamente. \n" ;      
        JOptionPane.showMessageDialog(null,q);
    }
    
    public void archivarDatosPropiedadBaldia(){
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\compraPropiedadBaldia.txt";
            String contenido = (q);
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
