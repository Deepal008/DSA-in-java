public class Recursion_Q3 {


    // Recursive function to find length

     public static void main(String[] args) {
         String str = "Hello";
         int length = stringLength(str);
         System.out.println("Length of the string is: " + length);
    }


    public static int stringLength(String str) {
        // Base case
        if (str.equals("")) {
            return 0;
        }
        
        // Recursive case
        return 1 + stringLength(str.substring(1));
    }

}
