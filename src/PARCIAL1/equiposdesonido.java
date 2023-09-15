/*
 brayan daniel coc inay
mariano galvez de guatemala 
ingenieria en sistemas
parcial I
 */
package PARCIAL1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class equiposdesonido {

    public static void main(String[] args) throws InterruptedException {

     // fecha y hora
     //String fechahora = DateTimeFormatter.ofPattern("MMM/dd/yyyy:hh:mm:ss a")
     String fechahora = DateTimeFormatter.ofPattern("MMM/dd/yyyy")
     
                    .format(LocalDateTime.now());
        
        Scanner opcion = new Scanner(System.in);

        int op;
        do {
            System.out.println("------MENU------");
            System.out.println("1.....Registrar productos en el Inventario");
            System.out.println("2.....Mostrar productos del Inventario");
            System.out.println("3.....ingresar producto al Inventario");
            System.out.println("4.....Extraer producto del Inventario");
            System.out.println("5.....Productos bajos de existencia");
            System.out.println("6.....Salir");

            op = opcion.nextInt();

            switch (op) {
                case 1: {

                    Scanner leer = new Scanner(System.in);

                    //----------------------ingresar datos
                    String codigo;
                    String nombres;
                    int cantidades;
                    String precios;
                    String fecha;
                    
                    //fecha ingreso
                    
                    //fin fecha
                    System.out.println("ingrese los datos requeridos");

                    System.out.println("Codido producto");
                    codigo = leer.nextLine();

                    System.out.println("Nombre producto");
                    nombres = leer.nextLine();

                    
                    cantidades = 0;

                    System.out.println("Precio producto");
                    precios = leer.next();
                    
                    fecha=fechahora;
                    
                    
                    
                    
                    

                    String rutaArchivo = "c:/ficheros/datos.txt";

                    try {
                        FileWriter fileWriter = new FileWriter(rutaArchivo, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                        String registro = codigo + "," + nombres + "," + cantidades + "," + precios+","+fecha+","+ 0;
                        bufferedWriter.write(registro);
                        bufferedWriter.newLine();

                        bufferedWriter.close();
                        fileWriter.close();

                        System.out.println("Producto guardado exitosamente.");
                    } catch (IOException e) {
                        System.out.println("Error al escribir en el archivo: " + e.getMessage());
                    }

                    //----------------fin ingresar datos
                    break;
                }//fin case 1

                case 2: {
                    //---------------------------mostra
                    String rutaArchivo = "c:/ficheros/datos.txt";
                    System.out.println("|Codigo   |Nombre producto   |Existencia   |Precio   |Total         |Fecha Reg.      |Fecha extr.");

                    float grantotal = 0;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo));
                        String linea;

                        while ((linea = bufferedReader.readLine()) != null) {
                            String[] campos = linea.split(",");

                            if (campos.length == 6) {
                                String codigo = campos[0];
                                String nombre = campos[1];
                                String cantidad = campos[2];
                                String precio = campos[3];
                                String fecharegistro=campos[4];
                               String fechamod=campos[5];

                                float cant1 = Integer.parseInt(cantidad);
                                float cant2 = Float.parseFloat(precio);
                                float total = cant1 * cant2;
                                grantotal = grantotal + total;

                                System.out.println(codigo + "        |" + nombre + "        |" + cantidad + "           |" + precio + "   |" + total+"   |"+fecharegistro+ "     |"+fechamod);
                                System.out.println("------------------------------------------------------");
                            } else {
                                System.out.println("Lo siento!!!No Hay Datos");
                            }
                        }

                        bufferedReader.close();
                    } catch (IOException e) {
                        System.out.println("Lo siento!!! No Hay Productos " + e.getMessage());
                    }
                    System.out.println("                                          Gran total Q>" + grantotal);

                    //------------------------------fin mostrar
                    break;
                }//fin case 2

                case 3: {
//--------------------------------ingresar datos

                    Scanner leer = new Scanner(System.in);
                    String codigoModificar;

                    System.out.println("Ingrese el código de producto a modificar:");
                    codigoModificar = leer.next();

                    String rutaArchivo = "c:/ficheros/datos.txt";
                    String rutaArchivoTemp = "temp.txt";

                    boolean codigoEncontrado = false; // Variable para rastrear si se encuentra el código

                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo));
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaArchivoTemp));

                        String linea;

                        while ((linea = bufferedReader.readLine()) != null) {
                            
                            String[] campos = linea.split(",");
                            String codigo = campos[0];
                            String existencia = campos[2];
                            String fechamod;
                            
                            
                            

                            if (codigo.equals(codigoModificar)) {
                                codigoEncontrado = true;

                                // Mostrar los detalles del producto
                                System.out.println("|Codigo   |Nombre producto   |Existencia   |Precio   |Total         |Fecha Reg.      |Fecha extr.");
                                System.out.println(campos[0] + "       | " + campos[1] + "         | " + campos[2] + "       | " + campos[3]+"  |  "+campos[4]+"  |  "+campos[5]);
                                System.out.println("-----------------------------");

                                System.out.println("Ingrese la nueva cantidad de producto:");
                                int nuevaexistencia;
                                nuevaexistencia = leer.nextInt();

                                int viejaexistencia = Integer.parseInt(existencia);
                                int total = viejaexistencia + nuevaexistencia;

                                campos[2] = String.valueOf(total);
                                
                                campos[4]=fechahora;
                                

                                linea = String.join(",", campos);
                                System.out.println("Nueva existencia actualizada.");
                                System.out.println(campos[0] + " | " + campos[1] + " | " + campos[2] + " | " + campos[3]+"  |  "+campos[4]+"  |  "+campos[5]);
                                System.out.println("-----------------------------");

                            }

                            bufferedWriter.write(linea);
                            bufferedWriter.newLine();
                        }

                        bufferedReader.close();
                        bufferedWriter.close();

                        File archivoOriginal = new File(rutaArchivo);
                        File archivoTemp = new File(rutaArchivoTemp);

                        archivoOriginal.delete();
                        archivoTemp.renameTo(archivoOriginal);

                        if (!codigoEncontrado) {
                            System.out.println("Lo siento!!! producto no existe.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    //fin ingreasar datos
                }//fin case 1
                break;
                case 4: {
                    //extraer
                    Scanner leer = new Scanner(System.in);
                    String codigoModificar;

                    System.out.println("Ingrese el código de producto a modificar:");
                    codigoModificar = leer.next();

                    String rutaArchivo = "c:/ficheros/datos.txt";
                    String rutaArchivoTemp = "temp.txt";

                    boolean codigoEncontrado = false; // Variable para rastrear si se encuentra el código

                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo));
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaArchivoTemp));

                        String linea;

                        while ((linea = bufferedReader.readLine()) != null) {
                            String[] campos = linea.split(",");
                            String codigo = campos[0];
                            String existencia = campos[2];
                            

                            if (codigo.equals(codigoModificar)) {
                                codigoEncontrado = true;

                                // Mostrar los detalles del producto
                                System.out.println("|Codigo   |Nombre producto   |Existencia   |Precio   |Total         |Fecha Reg.      |Fecha extr.");
                                System.out.println(campos[0] + " | " + campos[1] + " | " + campos[2] + " | " + campos[3]+"  |  "+campos[4]+"  |   "+campos[5]);
                                System.out.println("-----------------------------");

                                System.out.println("Ingrese la cantidad de producto a retirar:");
                                int nuevaexistencia;
                                nuevaexistencia = leer.nextInt();

                                int viejaexistencia = Integer.parseInt(existencia);

                                if (nuevaexistencia > viejaexistencia) {

                                    System.out.println("Existencia insuficiente");

                                } else {
                                    int total = viejaexistencia - nuevaexistencia;
                                    campos[2] = String.valueOf(total);
                                    campos[5]=fechahora;
                                    
                                    
                                    
                                    System.out.println("Nueva existencia actualizada.");
                                    System.out.println("|Codigo   |Nombre producto   |Existencia   |Precio   |Total         |Fecha Reg.      |Fecha extr.");
                                    System.out.println(campos[0] + " | " + campos[1] + " | " + campos[2] + " | " + campos[3]+"  |  "+campos[4]+"  |   "+campos[5]);
                                    System.out.println("-----------------------------");
                                }

                                linea = String.join(",", campos);

                            }

                            bufferedWriter.write(linea);
                            bufferedWriter.newLine();
                        }

                        bufferedReader.close();
                        bufferedWriter.close();

                        File archivoOriginal = new File(rutaArchivo);
                        File archivoTemp = new File(rutaArchivoTemp);

                        archivoOriginal.delete();
                        archivoTemp.renameTo(archivoOriginal);

                        if (!codigoEncontrado) {
                            System.out.println("Lo siento!!! producto no existe.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    //fin extraer
                }//fin case 4
                break;
                
                //-------------------------opcion extra productos con baja existencia
                case 5:
                {
                //---------------------------mostra baja existencia
                    String rutaArchivo = "c:/ficheros/datos.txt";
                    System.out.println("|Codigo   |Nombre producto   |Existencia   |Precio   |Total         |Fecha Reg.      |Fecha extr.");

                    float grantotal = 0;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo));
                        String linea;

                        while ((linea = bufferedReader.readLine()) != null) {
                            String[] campos = linea.split(",");
                                
                             String codigo = campos[0];
                                String nombre = campos[1];
                                
                                
                                String cantidad = campos[2];
                                String precio = campos[3];
                                String fecharegistro=campos[4];
                               String fechamod=campos[5];
                               
                               int existencia=Integer.parseInt(cantidad);

                            if (campos.length == 6 && existencia<=10 ) {
                               

                                int cant1 = Integer.parseInt(cantidad);
                                float cant2 = Float.parseFloat(precio);
                                float total = cant1 * cant2;
                                grantotal = grantotal + total;

                                System.out.println(codigo + "        |" + nombre + "        |" + cantidad + "   |" + precio + "   |" + total+"   |"+fecharegistro+ "     |"+fechamod);
                                System.out.println("------------------------------------------------------");
                            }// else {
                               // System.out.println("Lo siento!!!No Hay Datos");
                            //}
                        }

                        bufferedReader.close();
                    } catch (IOException e) {
                        System.out.println("Lo siento!!! No Hay Productos " + e.getMessage());
                    }
                    System.out.println("                                          Gran total Q>" + grantotal);

                    //------------------------------fin mostrar baja existencia
                    break;
                
                
                }
                 //-----------FIN OPCION EXTRA 
                
                
                 
                
            }
            
            
            

        } while (op != 6);

    }
}
