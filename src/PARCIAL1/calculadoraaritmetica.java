/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL1;
import java.util.Scanner;
/**
 *
 * @author braya
 */
public class calculadoraaritmetica {
    public static void main(String[] args){
   int opcion;
        
        Scanner Entrada = new Scanner(System.in);
do {
    System.out.println("---------------------------");
    System.out.println("  Calculadora Aritmética   ");
    System.out.println("---------------------------");
    System.out.println("1....Suma");
    System.out.println("2....Resta");
    System.out.println("3....Multiplicacion");
    System.out.println("4....Division");
    System.out.println("5.... Salir");
    System.out.print("Selecciones su opcion: ");
    opcion=Entrada.nextInt();
    switch(opcion){
        case 1:{
                    System.out.println("***************************");
                    System.out.println("      Operación Suma       ");
                    System.out.println("***************************");
                    float a,b,c;
                    System.out.print("Ingrese primer valor: ");
                    a=Entrada.nextFloat();
                    System.out.print("Ingrese segundo valor: ");
                    b=Entrada.nextFloat();
                    c=a+b;
                    System.out.println("El resultado de la suma es: "+c);
                    break;
                }//Fin case 1
        case 2:{
                    System.out.println("***************************");
                    System.out.println("      Operación Resta      ");
                    System.out.println("***************************");
                    float a,b,c;
                    System.out.print("Ingrese primer valor: ");
                    a=Entrada.nextFloat();
                    System.out.print("Ingrese segundo valor: ");
                    b=Entrada.nextFloat();
                    c=a-b;
                    System.out.println("El resultado de la resta es: "+c);
                    break;
                }//Fin case 2
        case 3:{
                    System.out.println("***************************");
                    System.out.println(" Operación Multiplicación  ");
                    System.out.println("***************************");
                    float a,b,c;
                    System.out.print("Ingrese primer valor: ");
                    a=Entrada.nextFloat();
                    System.out.print("Ingrese segundo valor: ");
                    b=Entrada.nextFloat();
                    c=a*b;
                    System.out.println("El resultado de la multiplicacion es: "+c);
                    break;
                    
                }//Fin case 3
        case 4:{
            
                    System.out.println("***************************");
                    System.out.println("     Operación División    ");
                    System.out.println("***************************");
                    /*
                        En esta pción de la División, validar a traves de 
                        una estructura condicional que la división NO sea
                        dentro de un numero cero(o), Ej. 5/0 (Error)
                    */
                    float a,b=0,c;
                   
                    System.out.print("Ingrese primer valor: ");
                    a=Entrada.nextFloat();
                    
                                      
                     do{   
                         
                         System.out.println("Ingrese segundo valor (no puede ser 0) : ");
                        b=Entrada.nextFloat();
                         
                     }while(b==0);
                        
                    c=a/b;
                    System.out.println("El resultado de la division es: "+c);
                    
                    break;
                    
                    
                    
                }//Fin case 4
                default:{
                    System.out.println("******Por favor seleccione una opción del menú, Gracias!!****");
                    break;
                }//Fin case 3
            }//Fin switch case
        } while (opcion!=5);   
        
    }
    
    
}
