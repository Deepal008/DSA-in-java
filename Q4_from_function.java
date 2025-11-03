import java.util.Scanner;

public class Q4_from_function {
    public static void binTOdec(int binnum){
        int pow = 0;
        int decnum = 0;

        while(binnum>0){
            int LD = binnum%10;

            decnum = decnum + (LD * (int)Math.pow(2, pow) );
            pow++;

            binnum = binnum/10;

        }
        System.out.println("Decimal number is :" + decnum );
    }

    public static void main(String[] args) {
        System.out.println("enter binary number");
        Scanner sc = new Scanner(System.in);
        int binnum = sc.nextInt();
        binTOdec(binnum);
    }
}