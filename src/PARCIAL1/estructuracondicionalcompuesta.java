/*
 CHIMALTENANGO
22 DE JULIO DE 2023
Programador:Brayan daniel coc inay

primer ejemplo en Java con datos personales
 */
package PARCIAL1;//nombre del paquete

import java.util.Scanner;


public class estructuracondicionalcompuesta {//inicio de la clase
        
    public static void main(String[] args) {
    
        System.out.println("ejemplo de estructura secuencial");
        Scanner teclado=new Scanner(System.in);
        
        int num1,num2,suma,producto;
        System.out.println("ingrese primer valor");
        num1=teclado.nextInt();
        System.out.println("ingrese segundo valor");
        num2=teclado.nextInt();
        
   if (num1>num2){
       System.out.println(num1);
   }else{
       System.out.println(num2);
   }
    
    }//fin main
}//fin clase estructura condicional
