package Threads;
//to find odd or even
class even extends Thread{
    public void run(){
        for(int i=2;i<=10;i=i+2){
            System.out.println("even number is :"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class odd extends Thread{
    public void run(){


    for(int i=1;i<=9;i=i+2) {
        System.out.println("odd number is :" + i);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
public class problem2 {
    public static void main(String[]args) {
        odd o1 = new odd();
        even e1 = new even();
        o1.start();
        try {
            o1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        e1.start();
    }
}
