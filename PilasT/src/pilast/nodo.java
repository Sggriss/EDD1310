/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilast;

/**
 *
 * @author garce
 */
public class nodo <T>{
    T dato;
     nodo siguiente;
    
    public nodo(T valor){
        dato = valor;
        siguiente = null;
    }
}
