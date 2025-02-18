class books {
    String author;
    String Tittle;

    void Displaydetails() {
        System.out.println("authorname:"+author);
        System.out.println("Tittle:"+ Tittle);
    }
}
   public class book{
       public static void main(String[]args){
           books reader=new books();
           reader.author="sam";
           reader.Tittle="raja";
           reader.Displaydetails();

       }
   }

