class box2{
    int length;
    int height;
    int breadth;
}
public class box{
    public static void main(String[]args){
         box2 blackbox=new box2();
         blackbox.length=29;
         blackbox.height=22;
         blackbox.breadth=34;
//create object in box2 class
         box2 whitebox=new box2();
         whitebox.height=34;

         System.out.println(blackbox.length);
        System.out.println(whitebox.height);

    }
}