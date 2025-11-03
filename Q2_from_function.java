import java.util.Scanner;

public class Q2_from_function {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }

    public static int bicoef(int n, int r){
        int fact_a = factorial(n);           //Here we get factorial of given number.
        System.out.println("factorial of n!: "+ fact_a);
        
        int fact_b = factorial(r);
        System.out.println("factorial of r!: "+ fact_b);
        
        int fact_c = factorial(n-r);
        System.out.println("factorial of (n-r)! :"+ fact_c);
        int bicoeff= fact_a/(fact_b*fact_c);

        return bicoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for factorial");
        int n = sc.nextInt();
        
        System.out.println("enter the another number for factorial");
        int r = sc.nextInt();
       
        System.out.println("nCr :" + bicoef(n, r));         //binomial coefficient
    }
}
    