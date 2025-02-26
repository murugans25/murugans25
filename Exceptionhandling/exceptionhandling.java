package Exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else  {
           System.out.println(a/b);
        }
    }



        public static void main(String[]args){
        Scanner scany=new Scanner(System.in);
        try {
            int a = scany.nextInt();
            int b=scany.nextInt();
            divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("hey good morining");
        }
            System.out.println("program is ended");

        }

}
