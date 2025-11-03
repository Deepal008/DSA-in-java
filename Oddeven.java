import java.util.*;;

public class Oddeven{
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
             if(a%2==0){
                System.out.println("The no is even");
             }
             else{
                System.out.println("The no is odd");
             }
        }
     }
}