package looop;

public class pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 5; i++) { //outer rows
            for (j = 0; j <= 5; j++) { // inner columns

                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
