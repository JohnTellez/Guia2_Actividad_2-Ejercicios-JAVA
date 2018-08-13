import java.util.Scanner;
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
       // Variables
       double Numero, Pies, Centi, Leguas, Yardas;
       char Opcion;
               
       // Recoger datos
       System.out.println("CALCULO DE PIES, CENTIMETROS, LEGUAS Y YARDAS\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       System.out.print("Ingrese el numero a convertir:  ");
       Numero = teclado.nextDouble();
       
       System.out.print("Ingrese la letra de unidad de conversion: P(Pies) C(Centimetros) L(Leguas) o Y(Yardas):  ");
       Opcion = teclado.next().charAt(0);
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
              Opcion = (char)(Opcion - 'a' + 'A');
              
       
       if (Opcion =='P'){
            
                System.out.print("Funcion P  ");
            };
       if (Opcion=='C'){
            
                System.out.print("Funcion C  ");
            };
       if (Opcion=='L'){
            
                System.out.print("Funcion L  ");
            };
       if (Opcion=='Y'){
            
                System.out.print("Funcion Y  ");
            };
       
      /*
       
       System.out.println("Resultados:\n");
       
       System.out.println("Semiperimetro: " + Math.round(Sperimetro * 100d) / 100d + " cm"); //Redondear los decimales con Math.round()
       
       System.out.println("Area:  " + Math.round(Area * 100d) / 100d + " m2");
       
       System.out.println("Circumradius:  " + Cradius + " cm");
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
      */ 
       
    }
}
