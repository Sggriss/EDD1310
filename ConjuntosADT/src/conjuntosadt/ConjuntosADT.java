/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntosadt;

import java.util.ArrayList;

/**
 *
 * @author garce
 */
public class ConjuntosADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Declaracion de los conjuntos
        conjunto<Integer> conjunto_1 = new conjunto();
        conjunto<Integer> conjunto_2 = new conjunto();

        // Añadir 
        conjunto_1.add(0);
        conjunto_1.add(1);
        conjunto_1.add(2);
        conjunto_1.add(3);
        conjunto_1.add(4);
        conjunto_2.add(3);
        conjunto_2.add(4);
        conjunto_2.add(5);
        conjunto_2.add(6);
        conjunto_2.add(7);

        // longitud 
        System.out.println("c1 length " + conjunto_1.length());
        System.out.println("c2 length " + conjunto_2.length());

        // Contenido 
        System.out.println("c1 contains 0 " + conjunto_1.contains(0));
        System.out.println("c1 contains 5 " + conjunto_1.contains(5));

        // eliminar
        conjunto_1.remove(0);

        //igualar 
        System.out.println("c1 == c2 " + conjunto_1.equals(conjunto_2));

        // subconjunto
        System.out.println("c1 subset c2 " + conjunto_1.isSubset(conjunto_2));

        // intersección
        conjunto<Integer> conjunto_intersection = conjunto_1.intersection(conjunto_2);
        System.out.println("intersection c1 c2 " + conjunto_intersection);

        // diferencia
        conjunto<Integer> conjunto_difference = conjunto_1.difference(conjunto_2);
        System.out.println("difference c1 c2 " + conjunto_difference);

        // unión
        conjunto_1.union(conjunto_2);
        System.out.println("c1 u c2 " + conjunto_1);

    }
}
