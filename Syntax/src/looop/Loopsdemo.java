package looop;

public class Loopsdemo {
    public static void main(String[] args) {
        //counter use and currently all are used in i
        //for(int counter=1;counter<=300;counter++){// i - iterator is loop variable
        //  System.out.println("*");

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {   // Changed i == 3 to i == 4 for a 5x5 pattern
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }