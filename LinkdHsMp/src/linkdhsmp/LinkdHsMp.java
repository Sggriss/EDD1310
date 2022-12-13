/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkdhsmp;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author garce
 */
public class LinkdHsMp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Map<Integer,String> linked = new LinkedHashMap<Integer, String>();
        
        linked.put(9, "Griss");
        linked.put(3, "Tony");
        linked.put(21, "Gus");
        linked.put(3, "Serch");
       
        
        System.out.println(linked);
             System.out.println("//////////////////////////");
        // consigue un dato
            System.out.println("se obtiene a: "+linked.get(4)); 
        System.out.println("//////////////////////////////");
        //Elimina un dato
        linked.remove(3); 
            System.out.println(linked);
        System.out.println("////////////////////");
        linked.replace(11,"Day"); //Reemplazamos el dato por otro dato
        System.out.println(linked);
        System.out.println("///////////////////////");
        linked.remove(21,"Gus");
            System.out.println(linked); 
             System.out.println("///////////////////");
        linked.clear(); //Limpieza
            if (linked.isEmpty()){
            System.out.println("No existe este dato");
        }
            
    
    }
    
}
