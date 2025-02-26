package Threads;
  class C extends Thread{
    public void run(){
    for(int i=0;i<5;i++) {
        System.out.println("hey buddy");
        System.out.println(" ");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
class D extends Thread{
      public void run(){
      for(int i=0;i<5;i++){
          System.out.println("how aye you");
          try {
              Thread.sleep(10);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
}
  }

public class example1thread {
    public static void main(String[]args){
     D n1=new D();
     n1.start();
     n1.setPriority(10);//priority range low 1 and high 10
     C n2=new C();
     n2.start();
     n2.setPriority(2);


    }
}
