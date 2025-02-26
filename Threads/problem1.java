package Threads;

import static java.lang.Thread.sleep;

class firstthread extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("thread one is :"+i);
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}


class secondthread extends Thread{
    public void run(){

        for(int i=6;i<=10;i++){
            System.out.println("second thread is :"+i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class problem1 {
    public static void main(String[]args){
      firstthread v1=new firstthread();
      secondthread v2=new secondthread();
      v1.setPriority(8);
      v2.setPriority(7);
      v1.start();
      v2.start();

    }

}
