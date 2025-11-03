import java.util.Scanner;

public class Q2_from_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        double fact = 1;

        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}