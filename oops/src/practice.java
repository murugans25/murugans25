 class demo{
  int time;
  String demoname;
  float timing;
//inner class
  class demo2 {
    int time;
    int date;

    // inner class
    class demo3 {

        String name;
        int time;
    }
}
}


          public class practice{
              public static void main(String[]args){
                  demo suresh=new demo();// create object in methods
                  suresh.timing=7.3f;
                  System.out.println(suresh.timing);

                  demo demo2 =new demo ();
                  demo2.time=22;
                  System.out.println(demo2.time);
              }

          }

