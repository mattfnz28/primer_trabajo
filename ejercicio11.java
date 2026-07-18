package javaapplication1;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio11 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresa 10 numeros");
        int num = sc.nextInt();
        int a = num;
        int b = num;
        for(int i = 2; i <= 10; i++){
            num = sc.nextInt();
            if (num >= a){
                a = num;
            }
            if (num <= b){
                b = num;
            }
        }
        System.out.println("numero mayor: " + a);
        System.out.println("numero menor: " + b);
    }
}
