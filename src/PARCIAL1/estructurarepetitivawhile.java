/*
 CHIMALTENANGO
29 DE JULIO DE 2023
Programador:Brayan daniel coc inay


 */
package PARCIAL1;
import java.util.Scanner;
/**
 *
 * @author braya
 */
public class estructurarepetitivawhile {
    public static void main (String[] arg){
        Scanner teclado= new Scanner(System.in);
        
        
      int contador = 0;  
      int[] datos = new int[10];
      
      
      for(int i=0;i<10;i++){//inicio for
          System.out.println("ingrese la nota No."+(i+1)+":");
        datos[i]=teclado.nextInt();  
          
        if(datos[i]>=7){
          contador++;
          }//fin if
          
        
      }//fin for
      
        System.out.println("Alumnos con nota mayor o igual a 7: "+contador);
        System.out.println("Alumnos con nota menor a 7 :"+(10-contador) );    
      
        
    }
}
