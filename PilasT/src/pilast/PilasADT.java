/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilast;

/**
 *
 * @author garce
 */
public class PilasADT <T> {
    private nodo cima;
    int tamanio;

    public PilasADT() {
        cima = null;
        tamanio = 0;
    }
    
    //metodo para saber si la pila esta vacia
    public boolean isEmpty(){
        
        return cima == null;
    }
    
    //metodo que regresa el tamanio de la pila
    public int length(){
        return tamanio;
    }
    
    public void push(T value){
        if(isEmpty()){
            cima = new nodo(value);
            return;
        }
        
        nodo viejo = cima;
        nodo nuevo = new nodo(value);
        
        nuevo.siguiente = viejo;
        
        cima = nuevo;
        return;
    }
    
    public nodo pop(){
        if(isEmpty()){
            System.out.println("La pila esta vacia");
        }
        nodo viejo = cima;
        nodo nuevo = new nodo(viejo);
        nuevo = cima.siguiente;
           
        return viejo;
    }
    
    public void peek(){
        if(isEmpty()) return;
        nodo iterador = cima;
        while(iterador != null){
            System.out.println("\n"+iterador.dato);
            iterador = iterador.siguiente;
        }
    }
}
