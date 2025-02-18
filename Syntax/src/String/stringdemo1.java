package String;

public class stringdemo1 {
    public static void main(String[] args) {
        // String creation
        String str1 = "Hello";
        String str2 = new String("World");

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // String length
        System.out.println("Length of str3: " + str3.length());

        // Accessing a character at a specific position
        System.out.println("Character at position 1 in str3: " + str3.charAt(1));

        // Substring
        String subStr = str3.substring(6);
        System.out.println("Substring from index 6: " + subStr);

        // Converting to upper case
        String upperStr = str3.toUpperCase();
        System.out.println("Upper case version of str3: " + upperStr);

        // Checking if strings are equal
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        // Checking if string is empty
        String str4 = "";
        if (str4.isEmpty()) {
            System.out.println("str4 is an empty string.");
        } else {
            System.out.println("str4 is not empty.");
        }

        // Replacing a character in a string
        String replacedStr = str3.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
    }
}
