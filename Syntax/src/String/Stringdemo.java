package String;

public class Stringdemo {
    //collection of characters
    public static void main(String[]args){
        String s1=new String("murugan");
        String s2="sam";//literal (objects are store in heap memory in all data data stored
        String s3= " ";//literal method
        System.out.println(
                (4 + 5) + "\n" + (4 + "4") + "\n" + (4 - 34 * 2 - 14) + "\n" +
                        ("suresh" + "murugan") + "\n" +
                        (s2 + " " + s1) + "\n" +
                        (s3.length()) + "\n" +
                                ( s3.isBlank()) + "\n" +
                        (s3.isEmpty()));
    }
}

