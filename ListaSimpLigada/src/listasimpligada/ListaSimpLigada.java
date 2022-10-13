/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimpligada;

/**
 *
 * @author garce
 */
public class ListaSimpLigada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creando objeto list de la clase listasADT
        listaADT<Integer> list = new listaADT<>();
        
        //Probando metodos de la lista
        
        list.estaVacia();
        
        list.getTamanio();
        
        list.agregarAlFinal(12);
        
        
        list.agregarAlInicio(19);
        
        
        list.agregarDespuesDe(4, 7);
        
        list.agregarAlInicio(95);
        list.agregarAlInicio(0);
        list.agregarAlInicio(87);
        list.agregarAlInicio(54);
        list.agregarAlInicio(165);
        list.agregarAlInicio(243);
        list.agregarAlInicio(89);
        
        
        list.eliminar(4);
        list.transversal();
        
        list.eliminarElFinal();
        list.transversal();
        
        list.eliminarElPrimero();
        
        
        list.buscar(7);
        
        list.actualizar(4, 0);
        
        list.getTamanio();
        
        list.transversal();
       
    
    }
    
}
