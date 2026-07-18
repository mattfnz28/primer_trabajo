package javaapplication1;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio10 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int suma = 0;
         System.out.println("Ingrese 10 numeros: ");
        for (int i = 1; i<=10; i++){
            int num = sc.nextInt();
            suma += num;
        }
        double promedio = suma /10;
        System.out.println("=== Resultado===");
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
    
}
    

