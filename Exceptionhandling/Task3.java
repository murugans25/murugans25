package Exceptionhandling;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner ant = new Scanner(System.in);
        System.out.println("Enter input");
        String vat = ant.nextLine();


        try {
            if (vat.equals("java")) {
                throw new Exception("java");

            } else {
                throw new Exception(" your input is mismatch");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        }
    }
