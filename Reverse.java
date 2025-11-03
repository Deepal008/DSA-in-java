public class Reverse {
    public static void main(String[] args) {
        // int a = 1236321;
        // int b;
        
        // while(a > 0){
        //     b = a % 10;
        //     System.out.print(b);
        //    a = a/10;
        // }
                

        int a = 1234321;
        int b;
        int rev = 0;
        while(a>0){
            b = a%10;
            rev = (rev*10) + b;
            a = a/10;
        }
        System.out.println(rev);

        if(a == rev){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
