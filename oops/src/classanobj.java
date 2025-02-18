import java.util.Scanner;

class bike{
    int year;
    String brand;
    String fueltype;
    double km;

    void getinput(){
        System.out.println(year + " " +brand+ " "+fueltype+ " " +km );

    }
}
    public class classanobj {
    public  static void main(String[]args) {

        Scanner sam = new Scanner(System.in);
        bike obj1 = new bike();

        obj1.year = sam.nextInt();
        sam.nextLine();
        obj1.brand = sam.nextLine();
        obj1.fueltype = sam.nextLine();
        obj1.km = sam.nextDouble();

        obj1.getinput();


    }
    }

