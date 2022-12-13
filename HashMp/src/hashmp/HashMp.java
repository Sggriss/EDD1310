/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmp;
import java.util.HashMap;
/**
 *
 * @author garce
 */
public class HashMp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ingresamos 2 datos porque al ser un hash  tiene una clave y un valor 
        HashMap <Integer,String>map= new HashMap<>(); 
        map.put(267, "Joaquin"); //Comienzamos a aniadir el primer dato 
            map.put(389,"Miranda");
                 map.put(545, "Santi");
        
        System.out.println(map);
            System.out.println("--------");
                System.out.println("el valor es: ");
    //Con esto llamamos a un solo dato ,el cual, tiene el mismo valor o clave
                    System.out.println(map.get(545)); 
        
        System.out.println("--------");
            map.remove(389); //Eliminamos del hash
            System.out.println(map);
                System.out.println("--------");
        
        if(map.containsKey(267)){
        // Indica que buscando un valor por su clave 
            System.out.println("el nombre del elemento a obtener es: "+ map.get(267)); 
        }
        System.out.println("--------");
        
        if (map.containsKey(85)) {
            System.out.println("es: "+map.get(85));
           
        //Se mapea la clave, si no se encuentra se muestra en pantalla un mensaje que dice "No existe este dato con la clave proporcionada"
        } else{
            System.out.println("No existe ese dato con la clave proporcionada");
        }
        System.out.println("--------");
              for (Integer indice: map.keySet()) {
        //Metodo para mostrar los datos del hash
                  System.out.println(map.get(indice)); 
        }
    }
    
}
