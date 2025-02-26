package Exceptionhandling;

import java.util.Scanner;

public class Exapmle2 {
    public static void main(String[]args){
        Scanner sample=new Scanner(System.in);
        int a=0,b=0;
        int c=0;

try {
    int arr[]=null;
    a=sample.nextInt();
    b=sample.nextInt();
    System.out.println(arr[3]);
    c=a*b;
    System.out.println(c);
}
catch (Exception e ){
    System.out.println("error occurred"+c);
}

        System.out.println("end of the program");
    }
}
