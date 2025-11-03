public class String_Palindrome {

    public static boolean ispalindrome(String str){
        for(int i =0; i< str.length()/2; i++){
            // for(int j = str.length()-i-1; j>str.length()/2; j--){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    System.out.println("the String is not palindrome");
                    return false;
                // }
            }
        }
        System.out.println("the String is palindrome");
        return true;
    }
    public static void main(String[] args){
        String str = "racecar";

        ispalindrome(str);

    }
}
