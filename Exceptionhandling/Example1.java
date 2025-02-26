package Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int a = 0;
        int b =  0;
        int c = 0;
        try {
            a = n1.nextInt();
            b = n1.nextInt();
            c = 0;
            c = a/b; // this line is throw exception
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("hey this is finally block");
        }
        System.out.println("program is enough");
        System.out.println("Final value is"+c);
    }
}
