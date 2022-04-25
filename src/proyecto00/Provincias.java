package proyecto00;
import javax.swing.JOptionPane;
public class Provincias {
private String ubicacion; 
    void elegirProvincias(){ 
    Object [] provincias ={"San José","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limón"}; 
       
        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccionar provincia de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,provincias, provincias[0]);
        
       ubicacion = (String) opcion+", ";
       //JOptionPane.showMessageDialog(null,ubicacion);
       
       switch((String)opcion){
          case "San José":{
            Object [] canton ={"San José","Escazú","Desamparados","Puriscal","Tarrazú",
           "Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita","Vásquez de Coronado",
           "Acosta","Tibás","Moravia","Montes de Oca","Turrubares","Dota","Currridabat","Pérez Zeledón","León Cortés"}; 
        
        Object opcion1 = JOptionPane.showInputDialog(null,
                "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);
        
      ubicacion = ubicacion +(String) opcion1;
      
             break;
          }
          case "Alajuela":{
             Object [] canton ={"Alajuela","San Ramón","Grecia","San Mateo","Atenas",
                 "Naranjo","Palmares","Poás","Orotina","San Carlos","Alfaro Ruíz",
                 "Valverde Vega","Upala","Los Chiles","Guatuso"}; 
        
            Object opcion2 = JOptionPane.showInputDialog(null,
                    "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);

          ubicacion = ubicacion +(String) opcion2;
          
             break;
          }
          case "Cartago":{
             Object [] canton ={"Cartago","Paraíso","La Unión","Jiménez","Turrialba","Alvarado","Oreamuno","El Guarco"}; 
        
            Object opcion3 = JOptionPane.showInputDialog(null,
                    "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);

          ubicacion = ubicacion +(String) opcion3;
          
             break;
          }
        case "Heredia":{
            Object [] canton ={"Heredia","Barva","Santo Domingo","Santa Bárbara",
                "San Rafael","San Isidro","Belén","Flores","San Pablo","Sarapiquí" }; 
        
        Object opcion4 = JOptionPane.showInputDialog(null,
                "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);
        
      ubicacion = ubicacion +(String) opcion4;
       
            break;
        }
        case "Guanacaste":{
            Object [] canton ={"Liberia","Nicoya","Santa Cruz","Bagaces","Carrillo",
                "Cañas","Abangares","Tilarán","Nandayure","La Cruz","Hojancha"}; 
        
        Object opcion5 = JOptionPane.showInputDialog(null,
                "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);
        
      ubicacion = ubicacion +(String) opcion5;
      
            break;
        }
        case "Puntarenas":{
            Object [] canton ={"Puntarenas","Esparza","Buenos Aires","Montes de Oro",
                "Osa","Aguirre","Golfito","Coto Brus","Parrita","Corredores","Garabito"}; 
        
        Object opcion6 = JOptionPane.showInputDialog(null,
                "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);
        
      ubicacion = ubicacion +(String) opcion6;
      
            break;
        }
        case "Limón":{
            Object [] canton ={"Limón","Pococí","Siquirres","Talamanca","Matina","Guácimo"}; 
        
        Object opcion7 = JOptionPane.showInputDialog(null,
                "Seleccionar canton de ubicacion:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,canton, canton[0]);
        
      ubicacion = ubicacion +(String) opcion7;
      
            break;
        }
          default:{
             
          }
        }
              // JOptionPane.showMessageDialog(null,ubicacion);
} 
 public String getUbicacion(){
     return ubicacion;
 }   
}


