/* *function parameter with return types
                     without return types
function overloading (same name bt differ parametrs)
passs by value
recursion

*/



public class mobile {
     static void iphone(){
        System.out.println("this is iphone");
        realme();oppo();
    }
   static void realme(){
        System.out.println("this is real me");
    }
   static void oppo(){
        System.out.println("this is oppo");

    }
    static int  add(int num1,int num2){
         return num1+num2;
    }
     static void  adds(int num1,int num2){
        System.out.println(num1+num2);

    }
    public static void main(String[]args ){


          System.out.println(add(2,2));
          adds(21,2);
        }
    }
