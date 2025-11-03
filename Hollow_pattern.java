import java.util.Scanner;

public class Hollow_pattern {
    public static void hollow_rectangle(int totrows, int totcolums){
        //outer loop
        for(int i = 1; i<=totrows; i++){
            // inner loop
            for(int j =1; j<=totcolums ; j++){
                if(i==1 || i == totrows || j==1 || j==totcolums){
                    System.out.print("*");
                }else{
                    System.out.print(" " );
             }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total numbers of row");
        int totrows = sc.nextInt();
        System.out.println("enter total numbers of colums");
        int totcolums = sc.nextInt();
        hollow_rectangle(totrows, totcolums);
    }
}
