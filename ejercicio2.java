package javaapplication1;

/**
 *
 * @matias fernandez
 */
import java.util.Scanner;
public class ejercicio2 {
      public static void main(String[] args) {
       
           Scanner sc = new Scanner(System.in);
           
           System.out.println("escribe un numero: ");
           int num1 = sc.nextInt();
          
           System.out.println("escribe el segundo numero: ");
           int num2 = sc.nextInt();
            
           System.out.println("1. suma");
           System.out.println("2. resta");
           System.out.println("3. multiplicacion");
           System.out.println("4. division");
           System.out.println("5. residuo");
           
           int opcion = sc.nextInt();
           
           switch (opcion){
               case 1: System.out.println("1. suma");
               System.out.println("resultado:" + (num1 + num2));
               break;
               
               case 2: System.out.println("2. resta");
               System.out.println("resultado:" + (num1 - num2));
               break;
               
               case 3: System.out.println("3. multiplicacion");
               System.out.println("resultado:" + (num1 * num2));
               break;
               
               case 4: System.out.println("4. division");
               System.out.println("resultado:" + (num1/num2));
               break;
               
               case 5: System.out.println("5. residuo");
               System.out.println("resultado:" + (num1 % num2));
               break;
           }
      }
}
