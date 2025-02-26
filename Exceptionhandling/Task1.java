package Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        Scanner newly = new Scanner(System.in);


        try {
            int a,b;
            a=newly .nextInt();
            b=newly.nextInt();
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a+b);
            System.out.println(a-b);
        }

        catch (Exception e){
            System.out.println(e);
        }
        finally {

            System.out.println(" operatator is ended");
        }

            }
        }



