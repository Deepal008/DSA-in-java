public class Recursion_Q2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args){
        

        
        convertinginEnglish(1234);
    }

    public static void convertinginEnglish(int n){

        if(n == 0){
            return;
        }

        int lastdigit = n % 10;

        convertinginEnglish(n/10);

        System.out.print(digits[lastdigit] + " ");
    }

}
