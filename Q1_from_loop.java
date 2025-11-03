import java.util.Scanner;

public class Q1_from_loop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            int choice;
            int evensum = 0;
            int oddsum = 0;

            do { 
                System.out.println("Enter the number");
                number = sc.nextInt();

                if(number % 2 ==0){
                    System.out.println("number is even");
                    evensum += number;
                   
                }else{
                    System.out.println("number is odd");
                    oddsum += number;
                    
                }
                System.out.println("if you want to continue the press 1 for yes otherwise press 0 to stop. ");
                choice = sc.nextInt();
            } while ( choice == 1);

            
            System.out.println("sum of the even number is :" + evensum);
            System.out.println("sum of the odd number is :" + oddsum);
        }
    }
}