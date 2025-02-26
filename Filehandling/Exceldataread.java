package Filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceldataread {
    public static void main(String[]args){
      String filepath="C:\\mm\\icanio.csv";
      String line;
      try(BufferedReader new1= new BufferedReader(new FileReader(filepath))){
          while ((line=new1.readLine())!=null){
              System.out.println(line);
          }
          new1.close();

      } catch (IOException e) {
          throw new RuntimeException(e);
      }




    }
}
