package Exceptionhandling;
import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
         Scanner new1=new Scanner(System.in);
         try {
             System.out.print("Enter a number: ");
             if (!new1.hasNextInt()) {
                 throw new Exception("Invalid input! Please enter a number.");
             }
             int nu = new1.nextInt();
             System.out.println("You entered: " + nu);

         }
         catch (Exception e){
             System.out.println("error is "+e);
         }
         finally {
             System.out.println("this is final answer");
             System.out.println("program is ended");
         }
    }
}
