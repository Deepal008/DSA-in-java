import java.util.Scanner;

public class function {

    // public static void calculatesum(){                  //without parameter  
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println("sum is :" + sum); 
    // }
    // public static void main(String[] args) {
    //    calculatesum();
    // }

    //  public static void calculatesum(int a , int b){       //with parameter
        
    //     int sum = a+b;
    //     System.out.println("sum is :" + sum); 
    // }
    // public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculatesum(a , b);
    // }

     public static int calculatesum(int a , int b){       //the values that inpute in function's definition is called parameter or formal parameter
        
        int sum = a+b;
        return sum;                                      //with return statement
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a , b);                   // the value that passes during function call is called argument or actual parameter
        System.out.println("sum is :" + sum); 
    }

}
