public class typecastinginimpilict {
    public static void main(String[] args) {
        int intVal = 100;
        double doubleVal = intVal;  // int → double (automatic conversion)

        float floatVal = 20.5f;
        double newDouble = floatVal;  // float → double

        System.out.println("int to double: " + doubleVal);
        System.out.println("float to double: " + newDouble);
    }
}
