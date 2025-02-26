package Threads;
class name1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Sam");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class name2 extends  Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("murugan");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



public class task1 {
    public static void main(String[]args){
        name1 l1=new name1();
        name2 l2=new name2();

        l1.start();
        l2.start();
        try {
            l1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            l2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("manoj");

    }
}
