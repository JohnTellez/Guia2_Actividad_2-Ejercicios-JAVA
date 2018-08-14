import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio3
{
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
       // Variables
        
       
       int Pasajeros, Breq, Tturistas, Tpagocond ;
       
       // Recoger datos
       System.out.println("\nCALCULO COSTOS Y VIAJES\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       System.out.println("Consideraciones:");
       System.out.println("*El bus tiene una capacidad de 37 pasajeros");
       System.out.println("*El Costo de cada pasajero es de $10.000");
       System.out.println("*El conductor debe pagar $2.000 por viaje al propietario");
       
       System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------\n");
       
               
       System.out.print("Ingrese numero de pasajeros :  ");
       Pasajeros = (int)teclado.nextDouble();
                  
       Breq = 1;
       if (Pasajeros > 37){
           Breq = (Pasajeros / 37)+1;
                      
        }
       if (Pasajeros < 37){
           Breq = 1;
           
        }
       
       DecimalFormat formato = new DecimalFormat("###,###.##");
       
       System.out.print("\nCantidad de Viajes a realizar:  "+ (Breq)+ "\n\n");
       Tturistas = Pasajeros * 10000;
       System.out.print("Valor total pago turistas:  $"+ formato.format(Tturistas) + "\n\n");
       Tpagocond = Breq * 2000;
       System.out.print("Valor a pagar al propietario del vehiculo:  $"+ formato.format(Tpagocond)+ "\n\n");
    }
}
