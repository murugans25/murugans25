public class datatype {
    byte smallNum ;
    short shortNum;
    int age ;
    long bigNum ;
    float pi ;
    double preciseValue;
    char letter ;
    boolean isJavaEasy;
    public static void main(String[] args) {
        datatype suresh=new datatype();

        suresh.smallNum = 10;
        suresh.shortNum = 1500;
         suresh.age = 25;
       suresh.bigNum = 10000000000L;
        suresh.pi = 3.11f;
        suresh.preciseValue = 99.99;
       suresh .letter = 'J';
        suresh.isJavaEasy = true;

        System.out.println(suresh.smallNum+" "+suresh.shortNum+" "+suresh.pi+" "+suresh.age+" "+
                suresh.bigNum+" "+suresh.pi+" "+suresh.preciseValue+
                suresh.letter+" "+suresh.isJavaEasy);
    }
}
