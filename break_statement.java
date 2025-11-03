import java.util.Scanner;
public class break_statement {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        do { 
              System.out.println("enter your number");
              int a = sc.nextInt();

              if(a%10==0){
                break;                 //break statement use to break the loop or iteration 
              }

          } while (true);
      }
    }
}