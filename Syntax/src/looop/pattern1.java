package looop;

public class pattern1 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}