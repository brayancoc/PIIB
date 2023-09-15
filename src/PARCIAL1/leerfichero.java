/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author braya
 */
public class leerfichero {
    

public static void main(String[] args) {
 
        FileReader fr = null;
  
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera lÃ­nea del fichero
            while (cadena != null) {               //mientras no se llegue al final del fichero                   
                System.out.println(cadena);        //se muestra por pantalla
                cadena = entrada.readLine();       //se lee la siguiente lÃ­nea del fichero                        
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }    
}
     
    

