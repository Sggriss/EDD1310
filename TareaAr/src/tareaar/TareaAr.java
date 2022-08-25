/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaar;

/**
 *
 * @author garce
 */
public class TareaAr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Arregloo uno = new Arregloo();
        Arregloo<String> uno =new Arregloo<String>();
        
        uno.setElemento(0, "Grisselle");
        uno.longitud();
        uno.getElemento(0);
        
        System.out.println(uno);
    }
    
}
