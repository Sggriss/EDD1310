/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilast;

/**
 *
 * @author garce
 */
public class PilasT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PilasADT <Integer> pil = new PilasADT<>();
        pil.push(10);
        pil.push(19);
        pil.push(126);
        pil.push(13);
        
        pil.length();
        
        pil.peek();
        
        pil.isEmpty();
        
        pil.pop();
    
    }
    
}
