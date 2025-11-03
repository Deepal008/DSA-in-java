import java.util.Scanner;

public class Multiplicationtable {
    public static void printmultiplication(int number){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
    public static void main(String[] args) {
       
        printmultiplication(5);
    }
}
