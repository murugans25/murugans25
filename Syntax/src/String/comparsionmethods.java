package String;
/* ------- comparsion methods;--------
*equals
* equalsignore
* compareTo
* compareToIgnorecase
* startwith(prefix,form index)
* endswidth
* contentEqauls(these methods are taken by character & stringbuffer)
*
*



*/


public class comparsionmethods {
    public static void main(String[] args) {
        String s1 = ("Romeo");
        String s2 = ("Romeo");
        String s3 = ("okay");
        //\lexicography means dictonary rules in check in letters
        int resultine = s1.compareToIgnoreCase(s2);
        System.out.println(resultine);
        //start with and endswidth  check letters in same or not
        // boolean domy=s1.startsWith(s2); thse format is chaecking
        boolean domy=s1.startsWith("romeo"); //to check condition is crt or not
        System.out.println(domy);
     //   boolean checker = s1.equalsIgnoreCase(s2);//equal ignore case method
     //   boolean chetta= s3.equals(s1);//equals method
       // System.out.println(checker);

       // System.out.println(chetta);

    }
}