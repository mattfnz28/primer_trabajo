
package javaapplication1;

/**
 *
 * @Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese su nota: ");
        int nota = sc.nextInt();
        
        if (nota >= 7){
            System.out.println("aprovado");
        }else{
            System.out.println("reprobado");
        } 
    }
    
}
