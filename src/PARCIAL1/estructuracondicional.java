/*
 CHIMALTENANGO
22 DE JULIO DE 2023
Programador:Brayan daniel coc inay

primer ejemplo en Java con datos personales
 */
package PARCIAL1;//nombre del paquete

import java.util.Scanner;


public class estructuracondicional {//inicio de la clase
        
    public static void main(String[] args) {
    
        System.out.println("ejemplo de estructura secuencial");
        Scanner teclado=new Scanner(System.in);
        int num1,num2,suma,producto;
        System.out.println("ingrese primer valor");
        num1=teclado.nextInt();
        System.out.println("ingrese segundo valor");
        num2=teclado.nextInt();
        
        suma=num1+num2;
        producto=num1*num2;
        
        System.out.println("la suma de los dos valores es:");
        System.out.println(suma);
        System.out.println("el producto de los dos valores es:");
        System.out.println(producto);
    
    }//fin main
}//fin clase estructura condicional
