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
       
       do {
             
       System.out.print("Ingrese el valor del radio de la circunferencia (metros):  ");
       Radio = teclado.nextDouble();
       
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       Pi = 3.14;
       
       ACirculo = Pi * Math.pow(Radio, 2); // Calcular el area del circulo
       
       ACuadrado = 2 * Math.pow(Radio, 2); // Calcular el area del cuadrado
       
       ASombreada = ACirculo - ACuadrado;  //calcular el area sombreada
       
       
       
       System.out.print("Resultados:  \n\n");
       
       System.out.print("Area sombreada: " + Math.round(ASombreada)+"\n\n");
       
       System.out.print("Area del circulo: " + Math.round(ACirculo)+"\n\n");
       
       System.out.print("Area del cuadrado: " + Math.round(ACuadrado)+"\n\n");
       
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
                    } while (Respuesta!='n');
    }
}

       
    
    
    
    

