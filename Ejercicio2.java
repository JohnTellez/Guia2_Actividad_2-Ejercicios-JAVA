import java.util.Scanner;
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{
   public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in);
       // Variables
       double Radio, ACirculo, ACuadrado, ASombreada, Pi;
      
       char Respuesta;       
       // Recoger datos
       System.out.println("CALCULO DEL ÁREA DE UN CUADRADO INSCRITO EN UNA CIRCUNFERENCIA\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
             
       System.out.print("Ingrese el valor del radio de la circunferencia (metros):  ");
       Radio = teclado.nextDouble();
       
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       Pi = 3.14;
       
       ACirculo = Pi * Math.pow(Radio, 2); // Calcular el area del circulo
       
       ACuadrado = 2 * Math.pow(Radio, 2); // Calcular el area del cuadrado
       
       ASombreada = ACirculo - ACuadrado;
       
       
       
       System.out.print("Resultados:  \n\n");
       
       System.out.print(ASombreada);
       
    }
}
      /* System.out.println("\n\n¿Desea realizar otra consulta? presione s/n ");
           Respuesta = teclado.next().charAt(0);
           if (Respuesta == 'n') {
                        
                            System.out.println("Saliendo, gracias.");
                            System.exit(1);
                        }
                        if (Respuesta != 's' && Respuesta != 'n'){
                            
                            System.out.println("Opcion no valida...cerrando");
                            System.exit(1);
                        }
              
       
       if (Opcion =='P'){
           System.out.print("Convirtiendo " + Numero + " Pies en Pulgadas.\n\n");     
           Pies = Numero / 0.0833;
           System.out.print("Resultado  " + Math.round(Pies * 100d)/ 100d + " Pulgadas");
           System.out.println("\n\n¿Desea realizar otra consulta? presione s/n ");
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
           System.out.print("Resultado  " + Math.round(Centi * 100d)/ 100d + " Pulgadas");
           System.out.println("\n\n¿Desea realizar otra consulta? presione s/n ");
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
           System.out.print("Resultado  " + Math.round(Leguas * 100d)/ 100d + " Pulgadas");
           System.out.println("\n\n¿Desea realizar otra consulta? presione s/n ");
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
           System.out.print("Resultado  " + Math.round(Yardas * 100d)/ 100d + " Pulgadas");
           System.out.println("\n\n¿Desea realizar otra consulta? presione s/n ");
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
        } */
       
        
     
       
    
    
    
    

