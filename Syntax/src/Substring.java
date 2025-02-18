import java.util.Locale;

public class Substring {
    public static void main(String[]args){
        String varma="murugani";
        String sure= varma.substring(6);
        System.out.println(sure);
        String sure2=varma.substring(2,4);
        System.out.println(sure2);

        String sam1=varma.toUpperCase(Locale.ROOT);
        System.out.println(sam1);

        System.out.println(varma.length());
        System.out.println(varma.toLowerCase());
        System.out.println(varma.isEmpty());
        System.out.println(varma  .getBytes());
        System.out.println(varma.toUpperCase());
        System.out.println(varma.concat(sam1));
    }
}