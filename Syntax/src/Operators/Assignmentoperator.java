package Operators;

public class Assignmentoperator {

    /*  thses ara assignment operator symbols
    =  assign value
    += add and assign
    -+subract and assign
    *=multiply and assign
    /=divide and assign
    %=modulus and assign

     */
    public static void main(String[]args){
        int a=10;
        int b=30;
        int c;
        c=a+b;
        System.out.println("c=a+b: "+c);
        //addition  c=c+a
                c+=a;
        System.out.println("c=c+a : "+c);
//subtract   c=c-a
        c-=a;
        System.out.println("c-=a :"+c);
//  multiply c=c*a
        c*=a;
        System.out.println("c*=a  :"+c);
// divide   c=c/a
        c/=a;
        System.out.println("c/=a :"+c);


    }
}
