/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarearedescvs;

import javax.swing.JOptionPane;

/**
 *
 * @author garce
 */
public class TareaRedescvs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        
         informacion Info = new informacion();
        archivo Archivo = new archivo();
        Archivo.LeerArchivo( "C:\\Users\\garce\\OneDrive\\Escritorio\\EDD1310\\presenciaredes.csv");
        
        
        do {     
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,    //JOptionPane.showInputDialog crea la ventana de opciopnes 
                        "---------------INDICE DE OPCIONES---------------\n "
                                + "1) Mostrar datos de los seguidores de facebook\n"
                                + "2) Mostrar datos del creciento de facebook en el año 2020\n"
                                + "3) Mostrar el porcentaje de facebook en el año 2020\n"
                                + "4) Mostar el crecimineto de las publicaciones     de facebook con respecto a los meses del año 2020\n"
                                + "5) Numero de me gusta en publicaciones en facebook \n"
                                + "6) Numero de punblicaiones compartidas  en facebook a lo largo del 2020\n"
                                + "7) Numero comentarios hechos facebook\n"
                                + "8) Numero de seguidodes en twitter por cada mes del año 2020  \n"
                                + "9) Crecimineto en cuanto a follower en twitter \n"
                                + "10) Porcentaje de crecimineto en twitter \n"
                                + "11) Numero de publicaiones en twitter\n"
                                + "12) Numero de Retuits\n"
                                + "13) Numero de me gustas en twitter \n"
                                + "14) Numero de impactos en twitter\n" 
                                + "15) Numero de videos en youtube \n"
                                + "16) Numero de visualizaciones en youtube \n "
                                + "17) Numero de comentarios en YOUTUBE\n "
                                + "18) Numero de me gusta  \n"
                                + "19) Observar la diferencia que existe entre los follower de twitter con respecto a los meses de Enero y Junio\n"
                              
                                + "20) Mostrar el cremineto de twitter y facebook\n"
                               
                                + "21)salir)\n\n"));
                                
                        
                        switch (opcion) {
                    case 1:
                         JOptionPane.showMessageDialog(null,"---------Seguidores de facebook-------");
                        Info.MostrarDatosFacebookSeguidores();
                        break;
                          case 2:
                               JOptionPane.showMessageDialog(null,"---------Crecimineto de Facebook-------");
                              Info.MostrarDatosFacebookCrecimineto();
                                break;
                         case 3:
                              JOptionPane.showMessageDialog(null,"---------Porcentaje de Facebook-------");
                             Info.mostrardatosFacebookPorcentaje();
                                break;
                         case 4:
                              JOptionPane.showMessageDialog(null,"---------Cantidad de publicaciones de Facebook por año-------");
                             Info.FACEBOOKPublicaciones();
                                break;
                          case 5:
                               JOptionPane.showMessageDialog(null,"--------Cantidad de me gusta en facebook-------");
                              Info.FacebookMeGusta();
                                break;
                         case 6:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de publicaciones compatidas de Facebook -------");
                             Info.FacebookPublicacionesCompartidas();
                                break;
                         case 7:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de comentarios de Facebook -------");
                             Info.FacebookComentariosCompartidos();
                                break;
                        case 8:
                            JOptionPane.showMessageDialog(null,"--------Cantidad de seguidores en twitter-------");
                            Info.TwitterSEGUIDORES();
                                break;
                        case 9:
                            JOptionPane.showMessageDialog(null,"--------Crecimineto de twitter -------");
                            Info.twitterCrecimineto();
                                break;
                         case 10:
                             JOptionPane.showMessageDialog(null,"--------Porcentaje de crecimineto de twitter-------");
                             Info.twitterPorcentaje();
                                break;
                         case 11:
                             JOptionPane.showMessageDialog(null,"--------Publicaciones de twitter-------");
                             Info.twitterPublicaciones();
                                break;
                         case 12:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de retuits -------");
                             Info.twitterRetuits();
                                break;
                         case 13:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de me gusta en twitter -------");
                             Info.twitterMeGusta();
                                break;
                         case 14:
                                JOptionPane.showMessageDialog(null,"--------Impactos generados en twitter-------");
                             Info.twitterImpactos();
                                break;
                         case 15:
                             JOptionPane.showMessageDialog(null,"--------Cantidad de videos de Youtube -------");
                             Info.YoutubeVideo();
                                break;
                          case 16:
                              JOptionPane.showMessageDialog(null,"--------Cantidad de  visualizaciones-------");
                              Info.YoutubeVisualizaciones();
                                break;
                        case 17:
                            JOptionPane.showMessageDialog(null,"--------Cantidad de comentarios realizados en Youtube -------");
                            Info.YoutubeComnetarios();
                                break;
                        case 18:
                            JOptionPane.showMessageDialog(null,"--------Cantidad de  me gusta en Youtube -------");
                            Info.YoutubeMeGusta();
                                break;
                        case 19:
                             JOptionPane.showMessageDialog(null, "el resultado del mes de enero y junio es :");
                             Info.MostrarDiferenciaDeSeguidores();
                                     break;
                      
                       case 20:
                           JOptionPane.showMessageDialog(null,"--------promedio de crecimineto de twitter y facebook------");
                           Info.PromedioDeCrecimineto();
                                break;
 
                      case 21:
                          opcion = 21;
                                break;
                    default:
                      
                }
                        
            } catch (NumberFormatException e) {
            }
            
        } while (opcion!= 21);
        
        
        
        
        
        
    
    }
    
}
