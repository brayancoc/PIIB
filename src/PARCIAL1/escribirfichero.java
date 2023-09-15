/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL1;
/*nuevas librerias*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*------*/

/**
 *
 * @author braya
 */
public class escribirfichero {
   public static void main(String[] args){
   
    
        Scanner sc = new Scanner(System.in);
        String cadena;
  
        try (FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
            PrintWriter salida = new PrintWriter(fw)) {   
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto    
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        }          
    }
    

   
   
   }
    
    

