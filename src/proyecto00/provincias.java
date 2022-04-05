package proyecto00;
import javax.swing.JOptionPane;

public class provincias {
    private String provincia;
    private char select;        
    private int answer;

    
 public void select(){
    do{ select= JOptionPane.showInputDialog(null,
         "Inserte la letra que corresponde a la provincia que desea buscar: \n\n"
            +"(s) San Jose \n\n" 
            +"(a) Alajuela \n\n" 
            +"(h) Heredia \n\n" 
            +"(c) Cartago \n\n"
            +"(l) Limón \n\n" 
            +"(p) Puntarenas \n\n" 
            +"(g) Guanacaste." ).toUpperCase().charAt(0);   
        
        switch(select){
            case 'S':{
                provincia = "San Jose";      
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                           //* JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            }
            case 'A':{
                provincia = "Alajuela";
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            }
            case 'H':{
                provincia = "Heredia";
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            } 
            case 'C':{
                provincia = "Cartago";
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            } 
            case 'L':{
                provincia = "Limon";
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            } 
            case 'P':{
                provincia = "Puntarenas";
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            } 
            case 'G':{
                 provincia = "Guanacaste";
                answer = JOptionPane.showConfirmDialog(null,
                    "Usted selecciono "+provincia +"\n Esta seguro de su seleccion?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.NO_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }else if(answer == JOptionPane.YES_OPTION) {
                            //*JOptionPane.showMessageDialog(null,answer );
                        }
                break;
            } 
          
            default:{
                answer=1;
                JOptionPane.showMessageDialog(null,"Usted escribio '"+select
                    +"' y esta letra que no es parte de las opciones.\n\n Revise por favor!");
            }
        }   
 }while ( answer != 0);
}
}


