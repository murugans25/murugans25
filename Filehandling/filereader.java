package Filehandling;

import java.io.FileWriter;

public class filereader {
    public static void main(String[]args){
        try {
            FileWriter m1=new FileWriter("murugans.txt",true);
            m1.write("Mahendra institute of technology");
            m1.append("        in namakkal District");
            m1.close();
            System.out.println("Successfully written");
        }catch (Exception e){
            System.out.println("something one mistake");
        }

    }
}
