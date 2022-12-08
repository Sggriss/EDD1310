/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablahsh;
import java.util.Arrays;
/**
 *
 * @author garce
 */
public class Tablahsh {

    /**
     * @param args the command line arguments
     */
     String [] Arreglo;
    int dimension, contable;
    public Tablahsh(int dim){
        dimension = dim;
        Arreglo=new String [dim];
        Arrays.fill(Arreglo,"-1");  
    }
    
    
    public void funcionTablaHash(String[] secuenciaArreglo, String[] arreglo){
        int i;
        for (i = 0; i < secuenciaArreglo.length; i++) {
            String elemento=secuenciaArreglo[i];
            int indiceArreglo=Integer.parseInt(elemento)%7;
            System.out.println("Su valor es: " + indiceArreglo + 
                    " Para el elemento" + elemento);
            while (arreglo[indiceArreglo] != "-1") {  
                indiceArreglo++;
            System.out.println("Error dentro del indice " + 
                        (indiceArreglo-1) + "Cambiar el valor del indice: " + 
                        indiceArreglo);
                indiceArreglo%=dimension;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }
    
    public void indicarValores(){
        int aumento = 0, i, j;
        for (i = 0; i < 1; i++) {
            aumento += 6;
            for ( j = 0; j < 63; j++) {
            System.out.print("....");
            }
            System.out.println();
            for (j = aumento -6; j < aumento; j++) {
            System.out.format("| %3s" + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 63; n++) {
            System.out.print(".....");
            }
            
            System.out.println();
            
            for (j = aumento - 6; j < aumento; j++) {
                if (Arreglo[j].equals("-1")) {
            System.out.print("----       ------");
                }else {
            System.out.print(String.format("| %3s " + " ", Arreglo[j]));
                }
                
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
            System.out.print("");
            }
            System.out.println();
        }
    }
    
    public String buscarEnHash(String dato){
        int indiceArreglo=Integer.parseInt(dato)%7;
        int contador = 0;
        while(Arreglo[indiceArreglo]!="-1"){
          if (Arreglo[indiceArreglo]==dato) {
            System.out.println("Su valor es: " + dato + 
                        " El valor del indice es : " + indiceArreglo);
                return Arreglo[indiceArreglo];
            }
      indiceArreglo++;
      indiceArreglo%=dimension;
            contador++;
            if (contador > 7) {
                break;
            }
        }
        return null;
}
        
    public static void main(String[] args) {
        Tablahsh tabla = new Tablahsh(10);
        String[] elementos = {"14","98","34","3","86","18","100","24","0","13"};
        tabla.funcionTablaHash(elementos, tabla.Arreglo);
        tabla.mostrarValores();
        
        String buscador=tabla.buscarEnHash("1567");
        String buscador1=tabla.buscarEnHash("230");
        String buscador2=tabla.buscarEnHash("38");
        String buscandor3=tabla.buscarEnHash("2");
        String buscandor4=tabla.buscarEnHash("68");
        String buscandor5=tabla.buscarEnHash("0");
        
        System.out.println("El dato 1567 no esta en la tabla\n ");
    }
 System.out.println("Aqui tus resultados :)");
    
}
