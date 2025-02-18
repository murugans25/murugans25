
    class employee{
        static int calc(int a){
            return a;
        }
        static  int calc(int a, int b){
            return a*b;
        }
        static double calc(double c,double  d){
            return c*d;
        }
    }
    public class employeee1 {
    public static void main(String[]args){
        employee emp=new employee();

        System.out.println("Full-time Salary: ₹" + emp.calc(50000));
        System.out.println("Part-time Salary: ₹" + emp.calc(500, 40));
        System.out.println("Freelancer Salary: ₹" + emp.calc(5, 7000));


    }
}
