package Filehandling;

import java.io.FileReader;
public class Readtotxtfile {
    public static void main(String[]args){
        try {
            FileReader n2=new FileReader("suresh.txt");
            int c=n2.read();

            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);

            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);

            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.print((char) c);
            c=n2.read();
            System.out.println((char) c);





            n2.close();
        }
      catch (Exception e){
            System.out.println("incorrect");
      }
    }
}
