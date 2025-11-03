import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("enter the number");
            int number = sc.nextInt();

            //ternary operator
            String type = ( (number%2==0)? "even ": "odd ");{
            System.out.println(type);

            String nature = ((number>0)? "positive" : "odd");
            System.out.println(nature);
            
            //fever test
            System.out.println("Enter temperature");
            float temp = sc.nextFloat();

            String fever = ((temp>100)? "you have a fever" : "you dont have fever");
            System.out.println(fever);
            
            System.out.println("enter a year");
            int year = sc.nextInt();

            boolean x = (year%4==0);
            boolean y = ( year%100 !=0);
            boolean z = (( year%100 ==0)    &&    (year% 400 == 0));
             if( x && ( y || z )){
                System.out.println(year + " is a leap year");
             }
             else {
                System.out.println(year + "is not a leap year");
             }
            }
        }
    }
}
