package javaapplication1;

/**
 *
 * @author Matias Fernandez
 */
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
         int suma = 0;
         int con = 0;
         int num;
         do{
             System.out.println("escribe numero positivos: ");
             num = sc.nextInt();
             if (num >= 0){
                  suma = suma + num;
             con ++;
              
             }
            
         } while (num >= 0);
         
                System.out.println("la suma de los numero es:" + suma);
                System.out.println("numeros ingresados: " + con);
    }
    
}
