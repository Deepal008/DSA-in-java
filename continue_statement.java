import java.util.Scanner;

public class continue_statement {
    public static void main(String[] args) {
        // for(int i=1; i<=10; i++){
        //     if(i==6){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

       try (Scanner sc = new Scanner(System.in)) {
        do { 
               System.out.println("Enter the number");
               int a = sc.nextInt();
               

               if( a % 10 == 0){
                continue;
               }
            System.out.println(a);
           } while (true);
       }
    }
}
