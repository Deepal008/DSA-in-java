// import java.util.Scanner;          //this code is for star pattern

// public class star_pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of lines");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){            //this is called nested loop
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }

import java.util.Scanner;   //this code is for inverted star pattern

public class star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){

            for(int j=1; j<=(n-i+1); j++){           
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}