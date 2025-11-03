import java.util.*;

public class Q10_pattern {
    public static void NUMBER_PYRAMID(int n){
        for(int i= 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        NUMBER_PYRAMID(n);
    }
}
