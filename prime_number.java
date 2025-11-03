import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();

            boolean isprime = true;

            if( n == 2){
                System.out.println("the number is prime");
            }
            else{

                for(int i = 2; i<= n-1; i++){
                    if( n % i == 0){
                        isprime= false;

                    }
                }
                if ( isprime == true){
                    System.out.println("n is prime number");
                }else{
                    System.out.println("n is not prime");
                }
            }
        }
    }
}
