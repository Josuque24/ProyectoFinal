package proyecto00;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
public class Venta {
    private Propiedad venderPropiedad []=new Propiedad [1];
    String s,q;
    
    public void ingresarDatosPropiedadConstruida () {
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresar el valor de la propiedad:")));
        pro.setMedidasPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresar la cantidad de metros cuadrados que tiene la propiedad:")));
        pro.setCantHabitaciones(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de habitaciones que tiene la propiedad:")));
        pro.setMedidasPatio(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de metros cuadrados que tiene el patio: \n"
                +"Si no tiene patio escriba cero","0")));
        pro.setCantBaños(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de baños que hay en la propiedad:")));
        pro.setComedor(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con un comedor?\"\n" +
                "0)No \n"+ "1) Si ")));
        pro.setSala(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con una sala?\"\n" +
                "0)No \n"+ "1) Si ")));
        pro.setGaraje(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con un garaje?\"\n" +
                "0)No \n"+ "1) Si ")));
        pro.setCuartoLavado(Byte.parseByte(JOptionPane.showInputDialog(null,
                "Cuenta la propiedad con un cuarto de lavado? \n"+
                "0)No \n"+ "1) Si ")));
        venderPropiedad[0]=pro;        
    } // fin de   ingresarDatosPropiedadConstruida
    
    public void mostrarDatosPropiedadConstruida () {
       String a,b,c,d,e,f;
       if(venderPropiedad[0].getMedidasPatio()>0){
           a="La propiedad tiene patio de "+venderPropiedad[0].getMedidasPatio()+ " m²" ;
       }else{
           a="La propiedad no tiene patio.";   
       }
       if(venderPropiedad[0].getComedor()==1){b= "Si";}else{b= "No";}
       if(venderPropiedad[0].getSala()==1){c="Si";}else{c="No";}
       if(venderPropiedad[0].getGaraje()==1){d="Si";}else{d="No";}
       if(venderPropiedad[0].getCuartoLavado()==1){e="Si";}else{e="No";}
       if(venderPropiedad[0].getCantBaños()>1){f=" baños";}else{f=" baño";}
       
       s="El valor de la propiedad es: "+ venderPropiedad[0].getValorPropiedad()+" colones. \n"
               +"La propiedad tiene "+venderPropiedad[0].getMedidasPropiedad() + " m² \n" 
               +"La propiedad tiene "+venderPropiedad[0].getCantHabitaciones()+" habitaciones. \n"
               + a + "\n"
               +"La propiedad tiene "+venderPropiedad[0].getCantBaños()+f+" \n"
               +"la propiedad tiene comedor: "+ b +"\n"
               +"La propiedad tiene sala: "+ c + "\n"
               +"La propiedad tiene garaje: "+ d +"\n"
               +"La cantidad tiene cuarto de lavado: "+ e +"\n";
       JOptionPane.showMessageDialog(null,s);
   } 
    
    public void archivarDatosPropiedadConstruida(){
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\ventaPropiedadConstruida.txt";
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
        String s=" ";
        Propiedad pro=new Propiedad ();
        pro.setValorPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresar el valor de la propiedad:")));
        pro.setMedidasPropiedad(Double.parseDouble(JOptionPane.showInputDialog(null,
                "Ingresar la cantidad de metros cuadrados que tiene la propiedad:")));
        venderPropiedad[0]=pro; 
    } // fin de ingresarDatosPropiedadBaldia
    
    public void mostrarDatosPropiedadBaldia () {       
       q="El valor de la propiedad es: "+ venderPropiedad[0].getValorPropiedad()+" colones. \n"
       +"La propiedad tiene "+venderPropiedad[0].getMedidasPropiedad() + " m² \n" ;      
       JOptionPane.showMessageDialog(null,q);
    } 
     
     public void archivarDatosPropiedadBaldia(){
        try {
            String ruta = "C:\\Users\\janjo\\OneDrive\\Documentos\\Universidad\\Progra\\projects\\proyecto00\\ventaPropiedadBaldia.txt";
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
    } // fin de mostrarFinal
    
} 
