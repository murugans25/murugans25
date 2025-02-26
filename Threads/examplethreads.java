package Threads;
class  A extends Thread{

    public void run(){
        System.out.println("hello guys");
    }

}
class B extends Thread{
    public void run(){
        System.out.println("always welcome");
    }
}

public class examplethreads {
public static void main(String[]args){
    A a1=new A();
    a1.start();
    B b1=new B();
    b1.start();
}
}
