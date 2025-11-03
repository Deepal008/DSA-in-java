import java.util.Scanner;

public class Q3_pattern {
    public static void inverted_half_number_pyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        inverted_half_number_pyramid(n);
    }
}