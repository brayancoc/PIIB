/*
 CHIMALTENANGO
15 DE JULIO DE 2023
Programador:Brayan daniel coc inay

primer ejemplo en Java con datos personales
 */
package PARCIAL1;

import java.util.Scanner;


public class estructuracondicionalsimple {//inicio clase
    
    public static void main(String[] args) {
        System.out.println("ejemplo de estructura condicional compuesta");
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.println("ingrese primer valor");
        num1=teclado.nextInt();
        System.out.println("ingrese el segundo valor");
        num2=teclado.nextInt();
        if(num1>num2){//inicio if
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }//fin if
    }//fin main
    
    
}//fin clase
