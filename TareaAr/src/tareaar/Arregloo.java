/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaar;

import java.util.ArrayList;

/**
 *
 * @author garce
 */
public class Arregloo<L> {
    private L tamano;
    ArrayList<L> Arreglo = new ArrayList<>();

    public Arregloo() {
    }
    
    public int longitud() {
        return (int) this.tamano;
    }
    
    public void setElemento(int indice,String valor){
        Arreglo.add((int) indice, (L) valor);
    }
    
    public int getElemento(int indice){
        return (int) indice;
    }
    
    public void limpiar(int valor){
        Arreglo.clear();
    }

    @Override
    public String toString() {
        return "Arreglo(" + "Arreglo=" + Arreglo + ')';
    }
    
    

    
        
}
