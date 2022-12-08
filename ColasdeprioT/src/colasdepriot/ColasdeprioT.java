/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasdepriot;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
/**
 *
 * @author garce
 */
public class ColasdeprioT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue cp = new PriorityQueue();
        
   cp.add(6);
     cp.add(3);
       cp.add(9);
        cp.add(1);
        
        
  System.out.println(cp);
  
  int eleccion = 0,nodoDatos = 0;
  Colametod cola = new Colametod();
  do {            
    try {
    eleccion =  Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de la Cola PriorAcot\n"
    + "1. Meter un dato para el nodo \n"
        + "2. Saca un nodo \n"
            + "3. Muestra en la pantalla todo el nodo \n"
                + "4. Adios \n"));
              
              
              
switch (eleccion) {
   case 1: nodoDatos = Integer.parseInt(JOptionPane.showInputDialog(null,"---¡Ey! esto es un nodo con un valor de prioridad--"));
        cola.aniadir(eleccion, nodoDatos);
                        
   case 2: if(!cola.Sacar()){
           JOptionPane.showInputDialog(null,"-----¡Ey! se saco un valor ):-----:  "+cola.Sacar());
                        
}else{
JOptionPane.showMessageDialog(null,"-----Esta cola esta vacia ,asi que no se puede devolver ningun valor-----");
    } break;
                                        
    case 3:cola.EnseniaDatos();
        break;
                                     
   case 4:eleccion  = 4 ;
   break;
   default:JOptionPane.showInputDialog(null,"-----Opcion no disponible, sorry-----");
        }
     } catch (NumberFormatException e) {
   }
 } while (eleccion !=4);
    }  
    
    
}
