import java.util.Scanner;

public class whileloop  {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int counter= 1;
        int n = sc.nextInt();
        int sum = 0;
        while(counter <=n){
          sum = sum+counter; //or sum += counter
          counter++;
        }
        System.out.println(sum);
      }
    }
}
