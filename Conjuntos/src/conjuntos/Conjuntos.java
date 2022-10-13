/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

import java.util.HashSet;

/**
 *
 * @author garce
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HashSet<ConjuntoADT> union, interseccion, diferencia;
        
        ConjuntoADT<String> jk = new ConjuntoADT<>();
        HashSet<String> jm = new HashSet<>();
        
        jk.getLong();
        
        //Agregando elementos al conjunto
        jk.agregar("Grisselle");
        jk.agregar("Miranda");
        jk.agregar("Javier");
        jk.agregar("David");
        jk.agregar("Daniel");
        
   
        System.out.println(jk);
        
        System.out.println("---------------Contenido del conjunto---------------------");
        jk.contenido("Miranda");//existe en el conjunto
        jk.contenido("Liz");//no existe en el conjunto
        
        jk.eliminar("David");//eliminando el elemento "Lupe" del conjunto
        System.out.println("Elemento eliminado del conjunto: " + jk);
        
        
        jm.add("Brian");
        jm.add("Gustavo");
        jm.add("Alicia");
        jm.add("Pamela");
        jm.add("Ingrid");
        
        jk.equals(jm);
        
        jk.subConjunto(jm);
        
        jk.interseccion(jm);
        
        jk.union(jm);
        
        jk.diferencia(jm);
        
        jk.iterador();
        
        
        
        
        
    
    }
    
}
