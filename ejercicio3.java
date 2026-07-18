package javaapplication1;

/**
 *
 * @MatiasFernandez
 */
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("escribe tu edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18){
            System.out.println("es mayor de edad");
        }
    }   
}
