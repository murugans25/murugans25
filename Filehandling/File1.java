package Filehandling;

import java.io.FileWriter;

public class File1 {
    public static void main(String[] args) {
        try{
        FileWriter w1=new FileWriter("Manoj.txt",true);
        w1.write("fish\n");
        w1.append(" big fish in the world");
        w1.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
