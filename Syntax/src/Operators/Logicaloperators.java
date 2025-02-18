package Operators;

public class Logicaloperators {

    /*  these ara logical operators in symbols
       &&   logical AND
       ||  Logical OR
       !     NoT


     */
    public static void main(String[] args) {
      int a=12;
      int temperature=20;

      boolean iswarm=temperature<22 && temperature>7;
      System .out.println(iswarm);
      //   &&   and operator using methods
      System.out.println((a>13)&&(a<50));
       int c=34;
       // a++-postincrement,++a  preincrement
      //to check in OR operator this condition is any one is true another condition is not check
        System.out.println((a>20)||(a<30));
        System.out.println(c);

    }
}
