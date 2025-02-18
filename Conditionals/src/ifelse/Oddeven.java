package ifelse;

import java.util.Scanner;

public class Oddeven {
   public static void main(String[]args) {
       /*      int numt=52;
        if(numt%2==0){
            System.out.println("this number is even"+numt);

        }

        else{
            System.out.println("this number os odd"+numt);

        }
    }*/
/*
      **************thse methods is get input in user to use scsnner class**********
 */
       Scanner muthesh=new Scanner(System.in);
       int num;
       System.out.println("enter a number and check");
       num=muthesh.nextInt();
       if(num%2==0){
           System.out.println("this is even number");
       }
else{
    System.out.println("this is odd number" );
       }
   }
}
