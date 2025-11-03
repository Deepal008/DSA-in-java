import java.util.Scanner;

public class Inverted_rotated_half_pyramid {
     public static void inverted_half_pyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                //spaces
               System.out.print(" ");
            }
            //star
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        inverted_half_pyramid(n);
    } 
}