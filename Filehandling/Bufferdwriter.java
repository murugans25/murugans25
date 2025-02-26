package Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferdwriter{
    public static void main(String[]args){
        try {
            FileWriter m1=new FileWriter("murugans.txt",true);
            BufferedWriter v1=new BufferedWriter(m1);
            v1.write("  hello buddy");
            v1.newLine();
            v1.write("Enjoy your day");
            v1.close();
            System.out.println("almost Success");
        }catch (Exception e){
          System.out.println("Something went wrong pls check your input");
        }

    }
}
