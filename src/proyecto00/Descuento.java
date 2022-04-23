package proyecto00;
import javax.swing.JOptionPane;
public class Descuento {
    private String a;
    private int answerDescuento;
    private int x;
    private Persona referencias[]=new Persona[3];
    
    
    public void referirNombres(){
        answerDescuento = JOptionPane.showConfirmDialog(null,
                    "Anote el nombre y el correo electronico de 3 amigos. \n"
                    +"Para que ellos puedan recibir información de esta increible app \n"
                    +"Y gane un 5% de descuento al realizar una compra.",
                    "¿Desea aplicar por un 2% de descuento?", JOptionPane.YES_NO_OPTION);
                        if (answerDescuento == JOptionPane.YES_OPTION) {
                          /* int x/*,y;*/
                           for(x=0;x<3;x++){
                                /*for(y=0;y<2;y++){ */
                                    Persona p=new Persona();
                                    
                                    p.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre de la persona "
                                        +(x+1)+ " que desea referenciar."));
                                    p.setEmail(JOptionPane.showInputDialog(null,"Digite el email de la persona "
                                        + (x+1) +" que desea referenciar."));
                                    p.setNumeroTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número de teléfono de la persona "
                                        + (x+1) + " que desea referenciar." )));
                                    referencias [x]=p;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Usted selecciono que no queria referir ningun amigo." ); 
                        } /*fin del else */
                         
    }/*fin referir nombres*/  
    
    public void mostrarNombresReferidos(){
        if(answerDescuento==JOptionPane.YES_OPTION){
            int x;
            String s="";
            for(x=0;x<3;x++){            
            s= s+ "El nombre del amigo "+(x+1)+" es "+referencias[x].getNombre()
                    +" su email es "+referencias[x].getEmail()+" y su número de teléfono es "+
                referencias[x].getNumeroTelefono()+" \n";
            }
            a=s;
            JOptionPane.showMessageDialog(null,s);
        }
    }   
}