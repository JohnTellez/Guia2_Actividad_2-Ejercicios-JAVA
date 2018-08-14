import java.util.Scanner;
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio4
{
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
       // Variables
        
       
       int Pbruto, Tvehiculo;
       double Pneto, Impuesto;
       char Respuesta;
       // Recoger datos
       System.out.println("\nCALCULO DE IMPUESTOS DE VEHICULO\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
           
             
       System.out.print("Ingrese precio bruto del vehiculo :  $");
       Pbruto = (int)teclado.nextDouble();
       do {
       System.out.print("Ingrese el numero segun el tipo de vehiculo: \n\n 1.Camioneta     2.Automovil     3.Salir:  ");
       Tvehiculo = (int)teclado.nextDouble();
       if (Tvehiculo == 1){
        
           System.out.print("\n\nVehiculo seleccionado:  Camioneta");
           System.out.print("\n\nValor bruto ingresado:  $" + Pbruto);
           System.out.println("\n\nLa información es correcta? presione s ó n ");
           Respuesta = teclado.next().charAt(0);
           System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n");
           do {
           if (Respuesta == 's') {
                                                  
                            if (Pbruto < 80){
                                
                                Impuesto = 0;
                                Pneto = (double)Pbruto + Impuesto;
                                System.out.println("\n\nResultados: ");
                                System.out.println("\n\nTipo de Vehiculo: Camioneta");
                                System.out.println("\n\nImpuestos a pagar: $"+ Impuesto);
                                System.out.println("\n\nPrecio neto del Vehiculo: $" + Pneto);
                                System.exit(0);
                            }
                            if (Pbruto >= 80){
                                
                                Impuesto = (double)Pbruto / 2;
                                Pneto = (double)Pbruto + Impuesto;
                                System.out.println("\n\nResultados: ");
                                System.out.println("\n\nTipo de Vehiculo: Camioneta");
                                System.out.println("\n\nImpuestos a pagar: $"+ Impuesto);
                                System.out.println("\n\nPrecio neto del Vehiculo: $" + Pneto);
                                System.exit(0);
                            }
                        }
           
           if (Respuesta == 'n') {
                        
                            System.out.println("\n\nSaliendo, gracias.");
                            System.exit(1);
                        }
           if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("\n\nOpcion no valida...cerrando");
                            System.exit(1);
                        }
                    } while (Respuesta!= 's');
       } 
       
       // Inicio Segundo vehiculo
       if (Tvehiculo == 2){
        
           System.out.print("\n\nVehiculo seleccionado:  Automovil");
           System.out.print("\n\nValor bruto ingresado:  $" + Pbruto);
           System.out.println("\n\nLa información es correcta? presione s ó n ");
           Respuesta = teclado.next().charAt(0);
           System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n");
           do {
           if (Respuesta == 's') {
                                                  
                            if (Pbruto < 20){
                                
                                Impuesto = 5;
                                Pneto = (double)Pbruto + Impuesto;
                                System.out.println("\n\nResultados: ");
                                System.out.println("\n\nTipo de Vehiculo: Automovil");
                                System.out.println("\n\nImpuestos a pagar: $"+ Impuesto);
                                System.out.println("\n\nPrecio neto del Vehiculo: $" + Pneto);
                                System.exit(0);
                            }
                            
                            if (Pbruto >= 20 && Pbruto <= 40){
                                
                                Impuesto = (double)Pbruto / 5;
                                Pneto = (double)Pbruto + Impuesto;
                                System.out.println("\n\nResultados: ");
                                System.out.println("\n\nTipo de Vehiculo: Automovil");
                                System.out.println("\n\nImpuestos a pagar: $"+ Impuesto);
                                System.out.println("\n\nPrecio neto del Vehiculo: $" + Pneto);
                                System.exit(0);
                            }
                            
                            if (Pbruto > 40){
                                
                                Impuesto = 9;
                                Pneto = (double)Pbruto + Impuesto;
                                System.out.println("\n\nResultados: ");
                                System.out.println("\n\nTipo de Vehiculo: Automovil");
                                System.out.println("\n\nImpuestos a pagar: $"+ Impuesto);
                                System.out.println("\n\nPrecio neto del Vehiculo: $" + Pneto);
                                System.exit(0);
                            }
                        }
                      
           if (Respuesta == 'n') {
                        
                            System.out.println("\n\nSaliendo, gracias.");
                            System.exit(1);
                        }
           if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("\n\nOpcion no valida...cerrando");
                            System.exit(1);
                        }
                    } while (Respuesta!= 's');
       } 
         
       if (Tvehiculo == 3){
        
           System.out.println("\n\nSaliendo, gracias.");
           System.exit(1);
           
       }
       if (Tvehiculo != 1 && Tvehiculo != 2 && Tvehiculo != 3 ){
        
           System.out.println("\n\nOpcion no valida...cerrando");
           System.exit(1);
           
       }
    } while (Tvehiculo!= 3);
    
}}
