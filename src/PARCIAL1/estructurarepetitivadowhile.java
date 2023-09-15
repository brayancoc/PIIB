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
public class estructurarepetitivadowhile {
   public static void main(String[] arg){
       
     Scanner leer =new Scanner(System.in);  
       
       int op = 0;
  
       do{
           System.out.println("ingrese los numeros :");
           op=leer.nextInt();
       }while(op!=0);
   }
}
