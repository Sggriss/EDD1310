/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimpligada;

/**
 *
 * @author garce
 */
public class listaADT<T> {
     nodo<T> head;
    int tamanio;

    public listaADT() {
    }
    
    //Metodos de la lista
    public Boolean estaVacia(){
        return this.head == null;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    
    public void agregarAlFinal(T valor){
        if( head == null){
            head = new nodo(valor);
        }else{
            nodo<T> nuevo = new nodo(valor);
            nodo<T> aux = head;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public void agregarAlInicio(T valor){
        if(head == null){
            head = new nodo(valor);
        }else{
            nodo<T> nuevo = new nodo(valor);
            nuevo.setSiguiente(head);
            head = nuevo;
            tamanio++;
        }
    }
    
    public void agregarDespuesDe(T referencia, T valor){
        if(head == null){
            head = new nodo(valor);
        }else{
            nodo<T> nuevo = new nodo(valor);
            
            nodo<T> aux = head;
            nodo<T> aux1 = head.getSiguiente();
            
            while(aux.getDato() != referencia){
                
                aux = aux.getSiguiente();
                aux1 = aux1.getSiguiente();
            }
            
            aux.setSiguiente(nuevo);
            aux.getSiguiente().setSiguiente(aux1);
            
            tamanio++;
        }
    }
    
    public void eliminar(int posicion){
        int pos = 0;
        
        if (head == null){
            System.out.println("Lista vacia");
        }else{
            nodo<T> auxAnterior = head;
            nodo<T> aux = head.getSiguiente();
            
            while(pos != posicion){
                pos++;
                aux = aux.getSiguiente();
                auxAnterior = aux.getSiguiente();
            }
            auxAnterior.setDato(aux.getDato());
            auxAnterior.setSiguiente(aux.getSiguiente());
            tamanio--;
        }
    }
    
    public void eliminarElFinal(){
        nodo<T> nuevo = head.getSiguiente();
        nodo<T> aux = head;
        
        while(nuevo.getSiguiente() != null){
            aux = aux.getSiguiente();
            nuevo = nuevo.getSiguiente();
        }
        
        aux.setSiguiente(null);
        
        tamanio--;
    }
    
    public void buscar(T valor){
        nodo<T> aux = head;
        int i = 0;
        
        try{
            while(aux.getDato() != valor && aux.getDato() != null){
                aux = aux.getSiguiente();
                i++;
            }
            System.out.println("El dato " + aux.getDato()+" esta en la posicion " + i);
        }catch(Exception e){
            System.out.println("El dato no esta registrado");
        }
        
    }
    
    public void actualizar(T buscar, T valor){
        nodo<T> aux = head;
        
        try{
            while(aux.getDato()!= buscar){
                aux = aux.getSiguiente();
            }
            aux.setDato(valor);
        }catch(Exception e){
            System.out.println("El dato a buscar no se encuentra registrado");
        }
    }
    
    public void transversal(){
        nodo<T> aux = head;
        
        while(aux != null){
            System.out.println(aux);
            aux = aux.getSiguiente();
        }
        System.out.println("\n");
    }

    void eliminarElPrimero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
