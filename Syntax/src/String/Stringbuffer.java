package String;
//mutable string
//stringbuffer is thred safe
//stringbuilder is not thread safe

public class Stringbuffer {
    public static void main(String[]args){

        StringBuffer  tomy= new StringBuffer("hello");
       StringBuffer obj=tomy.append("murugan");
      // String s2=(String("monday"));
       StringBuffer creamy=new StringBuffer("sureshe");
       StringBuffer obj2=creamy.append("sureshmutugan");

        System.out.println(tomy);
    }
}
