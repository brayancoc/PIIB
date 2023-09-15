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
public class calculadoraaritmeticaconmetodos {
   
  public void Sumar(){
      Scanner Entrada = new Scanner(System.in);   
        float a=0,b=0,c=0;
       System.out.println("***************************");
       System.out.println("      Operación Suma       ");
       System.out.println("***************************");
       System.out.print("Ingrese primer valor: ");
       a=Entrada.nextFloat();
       System.out.print("Ingrese segundo valor: ");
       b=Entrada.nextFloat();
       c=a+b;
       System.out.println("El resultado de la suma es: "+c);           
}//fin metodo suma

 public void restar(){
      Scanner Entrada = new Scanner(System.in);   
        float a=0,b=0,c=0;
       System.out.println("***************************");
       System.out.println("      Operación Resta       ");
       System.out.println("***************************");
       System.out.print("Ingrese primer valor: ");
       a=Entrada.nextFloat();
       System.out.print("Ingrese segundo valor: ");
       b=Entrada.nextFloat();
       c=a-b;
       System.out.println("El resultado de la suma es: "+c);           
}//fin metodo resta 
 public void multiplicar(){
      Scanner Entrada = new Scanner(System.in);   
        float a=0,b=0,c=0;
       System.out.println("*************************************");
       System.out.println("      Operación Multiplicacion       ");
       System.out.println("*************************************");
       System.out.print("Ingrese primer valor: ");
       a=Entrada.nextFloat();
       System.out.print("Ingrese segundo valor: ");
       b=Entrada.nextFloat();
       c=a*b;
       System.out.println("El resultado de la suma es: "+c);           
}//fin metodo multiplicar
 
public void dividir(){
      Scanner Entrada = new Scanner(System.in);   
       float a=0,b=0,c=0;
       System.out.println("*******************************");
       System.out.println("      Operación Division       ");
       System.out.println("*******************************");
       System.out.print("Ingrese primer valor: ");
       a=Entrada.nextFloat();
       
       
       
        do{   
         System.out.print("Ingrese segundo valor(no puede ser  0): ");
         b=Entrada.nextFloat();
                       
        }while(b==0);
       
       
       
       c=a/b;
       System.out.println("El resultado de la suma es: "+c);           
}//fin metodo suma 
  
  

  
 public static void main (String[] args){
 int opcion;
//En la siguiente linea se declara el objeto: invocametodos
//que servirá como enlace para llamar o invocar a los metodos:
//Sumar(),Restar(),Multiplicar(),Dividir()
calculadoraaritmeticaconmetodos invocametodos = new calculadoraaritmeticaconmetodos();
Scanner Entrada = new Scanner(System.in);
do {
    System.out.println("---------------------------------------");
    System.out.println("  Calculadora Aritmética con Metodos");
    System.out.println("---------------------------------------");
    System.out.println("1....Suma");
    System.out.println("2....Resta");
    System.out.println("3....Multiplicacion");
    System.out.println("4....Division");
    System.out.println("5.... Salir");
    System.out.print("Selecciones su opcion: ");
    opcion=Entrada.nextInt();
    switch(opcion){
        case 1:{ 
                    invocametodos.Sumar(); //Llamar o invocar al metodo Sumar()
                    break;
                }//Fin case 1
        case 2:{
                    invocametodos.restar();//Llamar o invocar al metodo Restar()
                    break;
                }//Fin case 2
        case 3:{
                    invocametodos.multiplicar();//Llamar o invocar al metodo Multiplicar()
                    break;
                }//Fin case 3
        case 4:{
                    invocametodos.dividir();//Llamar o invocar al metodo Dividir()
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
