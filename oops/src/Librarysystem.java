class library {

    int user ;
    int book;
    int card;
    String message;
}
class library2 {
    int userid;
    int pwd;
    long mobilenumber;
    String name;
}

public class Librarysystem{
    public static void main(String[]args){



        library details=new library();
        details.user=34;
        details.book=22;
        details.card=35;
        details.message=("book is available");


        library2 suresh=new library2();
        suresh.userid=66;
        suresh.name=("sam");
        suresh.pwd=(323);
        suresh.mobilenumber=90888888877l;

        System.out.println(details.book);
        library powerful=new library();
        powerful.book=22;
        System.out.println(powerful.book);

    }

}
