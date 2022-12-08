/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasdepriot;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
/**
 *
 * @author garce
 */
public class Colametod {
    private nodo inColas,finColas;
    String Colas = "      ";
    PriorityQueue<Object> pr = new PriorityQueue<>();
    public Colametod() {
    inColas = null;
    finColas = null;
            
    
    }
    public boolean estaVacia(){
        return inColas==null;
    }
    public void aniadir(int PriorityQueue ,int datos){
        nodo nwNodo = new nodo();
        nwNodo.prio = PriorityQueue;
        nwNodo.datos = datos;
        nwNodo.siguiente =null;
        
        if(estaVacia()){
           inColas = nwNodo; 
           finColas = nwNodo;
        }else{
            finColas.siguiente= nwNodo;
            finColas = nwNodo;
        }
    }
    
    public int Sacar(int PriorityQueue ){
     if(!estaVacia()){
            int dato = inColas.prio;
            if(inColas == finColas){
                inColas = null;
                finColas= null;
            
        }else{
            inColas = inColas.siguiente;
        }return  dato;
        }else{
              return Integer.MAX_VALUE;  
                }
    }   
    
public void EnseniaDatos(){
        nodo repaso = inColas;
        String ColaImp = "     ";
        while(repaso!=null){
            Colas += repaso.datos + "     ";
            repaso = repaso.siguiente;
            
        }
        //Separa la cadena
        String Lazo[]=Colas.split("       ");
    for(int i = Lazo.length -1;i>=0; i--){
        ColaImp += "    " + Lazo[i];
        
    }
        JOptionPane.showMessageDialog(null,ColaImp);
       Colas = "     ";
    
    }

    boolean Sacar() {
        throw new UnsupportedOperationException("-----No valido-----"); 
    }
}
