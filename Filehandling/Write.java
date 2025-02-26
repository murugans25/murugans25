package Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String []args){
       String path=("C:\\mm\\ sm.csv");

       try{
           FileWriter n1=new FileWriter(path);
           n1.write("sam salomon,watermelon\n");
           n1.write("Manoj , tuticorin, fishey");
           n1.close();
           System.out.println("well done");
       }
       catch (Exception e){
System.out.println("something went wrong");
       }
    }
}
