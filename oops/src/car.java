class cars{
    String brand;
    int price;
    void showdeatils(){
        System.out.println("brand:"+brand);
        System.out.println("price:"+price);

    }
}

public class car {
    public static void main(String[]args){
        cars siva=new cars();
        siva.brand="swift";
        siva.price=675;

        siva.showdeatils();


    }
}
