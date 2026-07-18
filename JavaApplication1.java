package javaapplication1;
/**
 *
 * @matias_fernandez
 */
import java.util.Scanner;
public class JavaApplication1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.next();
        
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Escribe tu carrera: ");
        String carrera = sc.next();
        
        System.out.println("Escribe tu estatura: ");
        float estatu = sc.nextFloat();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatu);
    }
    
}


