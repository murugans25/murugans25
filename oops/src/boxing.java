public class boxing {
    //methods -  carries out of a specific task
    //methods input- parameters arguments[all data types in call in methods]
    //which data type is return you must mention the (int)
   static int boxvolume(int length,int breadth , int height){ //method header   & method defintion
      int vol;//method body{.....  }// vol is variable
        vol= length*breadth+height;
        return vol;//return length+breadth+height;(this one type)
    }
    public static void main(String[]args){
        System.out.println("hello");//println is method
      int vole= boxvolume(34,45,899);//passing argument value pass
        System.out.println("lenth is :"+vole);
    }
}
  