
package proyecto00;
import javax.swing.JOptionPane;
public class Descuento {
    private int answer;
    private String s = "";
    private String referencias[][]=new String[3][2];
    
    
    public void referirNombres(){
        answer = JOptionPane.showConfirmDialog(null,
                    "Anote el nombre y el correo electronico de 3 amigos. \n"
                    +"Para que ellos puedan recibir información de esta increible app \n"
                    +"Y gane un 5% de descuento al final de la compra.",
                    "¿Desea aplicar por un 5% de descuento?", JOptionPane.YES_NO_OPTION);
                        if (answer == JOptionPane.YES_OPTION) {
                           int x,y;
                           for(x=0;x<3;x++){
                                for(y=0;y<2;y++){
                                    if (y==0){referencias[x][y]=JOptionPane.showInputDialog(null,
                                    "Ingrese el nombre completo de su amigo número "+(x+1));
                                    s = s + referencias[x][y] + " es el nombre de su amigo " +(x+1) + " y su email es ";
                                    }else if(y==1){referencias[x][y]=JOptionPane.showInputDialog(null,
                                    "Ingrese el email de su amigo número "+(x+1) );
                                    s =  s + referencias[x][y];
                                    } 
                                    
                                }
                                s = s + "\n";
                                
                            }
                            
                          JOptionPane.showMessageDialog(null, "La informacion de los amigos referenciados es :\n\n " + s); 
                           //*poner aqui la salida del descuento
                        }else{
                        }
    }
  }