class outer1{
    int length=10;
    int breadth=10;
    int height=15;

    class outer2{
        int length=10;
        int breadth=10;
        int height=15;

        class outer3{
            int length=10;
            int breadth=10;
            int height=10;

            int displayit(){
                int vol=length+breadth+height;
                return vol;
            }
        }
    }
}


public class Basics1 {
    public static void main(String[]args){

        outer1 outerObj = new outer1();
        outer1.outer2 outer2Obj = outerObj.new outer2();
        outer1.outer2.outer3 outer3Obj = outer2Obj.new outer3();
        int result = outer3Obj.displayit();
        System.out.println("Output: " + result);
    }
}