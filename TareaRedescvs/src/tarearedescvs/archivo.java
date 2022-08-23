/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarearedescvs;

import  javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author garce
 */
public class archivo {
    private BufferedReader Lector; //Encargado de leer 
    private String Linea;//Recibe la linea de cada fila existente 
    private  String partes[] = null; //Almacena cada linea leida 
     public void LeerArchivo(String NombreArchivo){
         try {
             Lector = new BufferedReader(new FileReader(NombreArchivo));
             while((Linea = Lector.readLine())!= null){
             partes = Linea.split(",,");//Separa cuando encuentra comas
         
             imprimirlinea();
                 System.out.println();
             
             }
             Lector.close();
             Linea = null;
             partes=null;
                    
                     
         } catch (Exception e) {
             JOptionPane.showMessageDialog(  null, e) ;
         }
     }    

    private void imprimirlinea() {
        for(int i =0;i<partes.length;i++){
            System.out.println(partes[i]+" / ");
        }
    }
}
