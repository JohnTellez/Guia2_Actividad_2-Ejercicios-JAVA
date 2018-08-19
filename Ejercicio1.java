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
       char Respuesta;       
       // Recoger datos
       System.out.println("CALCULO DE PIES, CENTIMETROS, LEGUAS Y YARDAS\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       do {
       
       System.out.print("Ingrese el numero a convertir:  ");
       Numero = teclado.nextDouble();
       
       System.out.print("Ingrese la letra de unidad: \n\n 1. Pies (p) \n\n 2. Centimetros (c) \n\n 3. Leguas (l) \n\n 4. Yardas (y) \n\n 5. Salir (s):  ");
       Opcion = teclado.next().charAt(0);
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       Opcion = (char)(Opcion - 'a' + 'A');
              
       
       if (Opcion =='P'){
           System.out.print("Convirtiendo " + Numero + " Pies en Pulgadas.\n\n");     
           Pies = Numero / 0.0833;
           System.out.print("Resultado  " + Math.round(Pies) + " Pulgadas");
           System.out.println("\n\n ¿Desea realizar otra consulta? presione s/n ");
           Respuesta = teclado.next().charAt(0);
           if (Respuesta == 'n') {
                        
                            System.out.println("Saliendo, gracias.");
                            System.exit(1);
                        }
                        if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("Opcion no valida...cerrando");
                            System.exit(1);
                        }
            };
       if (Opcion=='C'){
           System.out.print("Convirtiendo " + Numero + " Centimetros en Pulgadas.\n\n");       
           Centi = Numero * 0.393701;
           System.out.print("Resultado  " + Math.round(Centi) + " Pulgadas");
           System.out.println("\n\n ¿Desea realizar otra consulta? presione s/n ");
           Respuesta = teclado.next().charAt(0);
           if (Respuesta == 'n') {
                        
                            System.out.println("Saliendo, gracias.");
                            System.exit(1);
                        }
                        if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("Opcion no valida...cerrando");
                            System.exit(1);
                        }
            };
       if (Opcion=='L'){
           System.out.print("Convirtiendo " + Numero + " Leguas en Pulgadas.\n\n");     
           Leguas = Numero * 190080;
           System.out.print("Resultado  " + Math.round(Leguas) + " Pulgadas");
           System.out.println("\n\nÂ¿Desea realizar otra consulta? presione s/n ");
           Respuesta = teclado.next().charAt(0);
           if (Respuesta == 'n') {
                        
                            System.out.println("Saliendo, gracias.");
                            System.exit(1);
                        }
                        if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("Opcion no valida...cerrando");
                            System.exit(1);
                        }
            };
       if (Opcion=='Y'){
           System.out.print("Convirtiendo " + Numero + " Yardas en Pulgadas.\n\n");     
           Yardas = Numero * 36;
           System.out.print("Resultado  " + Math.round(Yardas) + " Pulgadas");
           System.out.println("\n\nÂ¿Desea realizar otra consulta? presione s/n ");
           Respuesta = teclado.next().charAt(0);
           if (Respuesta == 'n') {
                        
                            System.out.println("Saliendo, gracias.");
                            System.exit(1);
                        }
                        if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("Opcion no valida...cerrando");
                            System.exit(1);
                        }
            } 
            
       if (Opcion== 'S') {
           System.out.println("Saliendo, gracias.");
            System.exit(1);
        }
        } while (Opcion!='s');
        }
     
}
