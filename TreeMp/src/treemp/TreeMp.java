/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemp;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author garce
 */
public class TreeMp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Le informamos como se va a componer 
        Map<Integer,String> treemap= new TreeMap<Integer,String>();
         
        treemap.put(35, "Liz");
            treemap.put(50, "Vale");
                treemap.put(93, "Alan"); //El put nos sirve para insertar
                System.out.println(treemap);
        
        
        treemap.remove(35);
        // Mandamos a que elimine un dato
            System.out.println("---Elimina un valor---");
                System.out.println(treemap);
        
        System.out.println("--------");
        // Recuperamos un dato
            System.out.println("el valor es: "); 
                System.out.println(treemap.get(93));
                    System.out.println("--------");
        if(treemap.containsKey(50)){
            System.out.println("El valor es:"+treemap.get(50)); // Esto es para obtener un valor
        } else{
            System.out.println("Valor no encontrado");
        }
        System.out.println("-------");
         if(treemap.containsKey(71)){
            System.out.println("El valor es: "+treemap.get(71));  
        } else{
            System.out.println("No existe este valor dado");
            
        }
         System.out.println("Remplaza ");
            treemap.replace(77, "Alicia"); //Cambia un valor asignado 
         System.out.println(treemap);
         System.out.println("---sin dato---");
         treemap.clear();
            System.out.println(treemap);
         System.out.println("----añade de nuevo----");
         treemap.put(66,"Javier");
            System.out.println(treemap);
    
    }
    
}
