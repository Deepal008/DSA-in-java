import java.util.Scanner;

public class Q3_from_function {
    public static boolean prime_num(int n){
        
        boolean isprime = true;
        
        if(n==2){
            return isprime;
        }
        else{
            for(int i=2; i<=n-1; i++){
                if(n%i==0){
                    isprime = false;                   
                }
            }
        }
        return isprime;
    }

    // public static boolean prime_num(int n){

    //     if(n == 2){
    //         return true;
    //     }
    //     else{
    //         for(int i=2; i<= Math.sqrt(n); i++){
    //         if(n%i==0){
    //             System.out.println("the number is not prime");
    //             return false;
    //         }
    //     }
    //     System.out.println("the number is prime");
    //     return true;
    //  }
    // }
    public static void primesinrange(int n){
    for(int i=2; i<=n; i++){
        if(prime_num(i)){
           System.out.print(i + " ");
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        primesinrange(n);
    }
}