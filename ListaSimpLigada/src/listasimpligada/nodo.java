/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimpligada;

/**
 *
 * @author garce
 */
public class nodo<T> {
    private T dato;
    private nodo<T> siguiente;

    public nodo() {
        
    }

    public nodo(T dato, nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public nodo(T valor){
        this.dato = valor;
    }
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
