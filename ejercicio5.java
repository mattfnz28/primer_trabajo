package javaapplication1;

// @Matias Fernandez
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Ingrese una calificacion entre 0 y 10: ");
        double calificacion = sc.nextDouble();
        
        if (calificacion >= 9 & calificacion <= 10){
            System.out.println("EXELENTE!!");
        }
        if (calificacion >= 8 & calificacion <= 8.99){
            System.out.println("MUY BUENO!!");   
    }
        if (calificacion >= 7 & calificacion <= 7.99){
            System.out.println("BUENO!!");
        }
        if (calificacion >= 5 & calificacion <= 6.99){
            System.out.println("REGULAR!!");
        }
        if (calificacion >= 0 & calificacion <= 4.99){
            System.out.println("DEFICIENTE!!");
    }
   
 }
    
}