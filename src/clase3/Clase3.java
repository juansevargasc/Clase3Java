/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.*;

/**
 *
 * @author juanvargas
 */

//Buscar Jeliot 3

public class Clase3 
{

    /**
     * @param args the command line arguments
     */
    
    /**
     * Función que permite calcular el salario de un empleado
     * @param horas
     * @param valor
     * @return total 
     */
    
    public static double calcularSalario(int horas, int valor)
    {
        double total = 0;
        double parcial = 0;
        if(horas > 40)
        {
           total = 40 * valor;
           System.out.println("Primeras 40 horas: " + total);
           if(horas < 48)
           {
               parcial = (horas - 40) * (2 * valor);
               total += parcial;
               System.out.println("Horas pagadas al doble: " + parcial);
           }
           else
           {
               parcial = (8) * (2 * valor);
               total += parcial;
               System.out.println("Horas pagadas al doble: " + parcial);
               parcial = (horas - 48) * (valor * 3);
               total += parcial;
               System.out.println("Horas pagadas al triple: " + parcial); 
           }
        }
         else
         {
             total = horas * valor;
             System.out.println("Salrio por 40 horas o menos: " + total);
         }
        return total;
    }
    
    
    public static void main(String[] args)
    {
        Scanner iStream = new Scanner(System.in);
        String nombre = null;
        int numHoras = 0;
        int valorHora = 0;
        double valorPagar = 0;
        
        
        //Lectura de datos
        System.out. println("Nombre: ");
        nombre = iStream.next();
        System.out. println("El nombre ingresado fue: " + nombre);
        
        System.out.println("Horas trabajadas: ");
        numHoras = iStream.nextInt();
        
        System.out.println("Valor estándar recibido por una hora: ");
        valorHora = iStream.nextInt();
        
        valorPagar = calcularSalario(numHoras, valorHora);
        System.out.println("\nSalario total: " + valorPagar);
        
        
        
        // TODO code application logic here
    }
    
}
