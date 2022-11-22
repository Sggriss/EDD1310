/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colastarea;

import javax.swing.JOptionPane;
/**
 *
 * @author garce
 */
public class ADTcolas {
     private nodo inicioCola, finalCola;
    int tamanio;
    String Cola = " ";

    public ADTcolas() {
        inicioCola = null;
        finalCola = null;
    }
    
    //MÉtodo para saber si está vacia la cola
    public boolean isEmpty(){
        if(inicioCola == null){
            return true;
        }else{
            return false;
        }
    }
    
    //Método para regresar el numero de elementos de la cola
    public int length(){
        return tamanio;
    }
    
    //Método para ingresar elementos al final de la cola
    public void enqueue(int elem){
        nodo nuevo = new nodo(elem);
        nuevo.dato = elem;
        nuevo.siguiente = null;
        
        if (isEmpty()) {
            inicioCola = nuevo;
            finalCola = nuevo;
        } else {
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
        }
    }
    
    public int dequeue(){
        if (!isEmpty()) {
            int elemento = inicioCola.dato;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return elemento;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void Mostrar(){
        nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.dato + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena [] = Cola.split(" ");
        
        for(int i = cadena.length-1; i>= 0; i--){
            ColaInvertida += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = " ";
    }
}
